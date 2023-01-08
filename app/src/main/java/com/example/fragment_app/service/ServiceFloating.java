

package com.example.fragment_app.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.fragment_app.R;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

import com.example.fragment_app.DataActivity;

public class ServiceFloating extends Service {

    private static final String TAG = ServiceFloating.class.getSimpleName();

    private WindowManager windowManager;
    private ImageView mFloatingActionButton;
    private long mLastPresstime;
    private long mExportLogcatFrom;
    private boolean isInvalidForClickEvent = false;
    private boolean isLongPress = false;
    private boolean isDoubleClick = false;
    private boolean isDoubleClickTwice = false;
    private static final long DOUBLECLICK_MS_THRESHOLD = 300;
    private static final long LONG_PRESS_MS_THRESHOLD = 500;
    private static final int BUTTON_DRAG_THRESHOLD = 20;

    private static final String LOG_PATH = "/storage/emulated/0/Android/data/com.panasonic.asc.cse.pce.driveboss/files/logDB/";

    BroadcastReceiver receiver;

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind: ");
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public void onCreate() {

        Log.d(TAG, "onCreate: ");

        super.onCreate();
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        mFloatingActionButton = new ImageView(this);
        Drawable icon = null;

        try {
            icon = getApplicationContext().getPackageManager().getApplicationIcon(getPackageName());
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        mFloatingActionButton.setImageDrawable(icon);
        
        int LAYOUT_FLAG;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        } else {
            LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_PHONE;
        }


        final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                LAYOUT_FLAG,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT);

        params.gravity = Gravity.TOP | Gravity.LEFT;
        params.x = 0;
        params.y = 100;
        params.packageName = getPackageName();

        windowManager.addView(mFloatingActionButton, params);

        try {
            mFloatingActionButton.setOnTouchListener(new View.OnTouchListener() {
                private WindowManager.LayoutParams paramsF = params;
                private int initialX;
                private int initialY;
                private float initialTouchX;
                private float initialTouchY;
                boolean isDrag = false;

                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:

                            long pressTime = System.currentTimeMillis();
                            if ((pressTime - mLastPresstime) <= DOUBLECLICK_MS_THRESHOLD) {
                                Log.d("Floating button", "DoubleClicked");
                                isDoubleClick = true;
                                if (!isDoubleClickTwice) {
                                    isDoubleClickTwice = true;
                                    mExportLogcatFrom = pressTime;
                                    mFloatingActionButton.setBackgroundColor(Color.RED);

                                    onDoubleClick();
                                } else {
                                    isDoubleClickTwice = false;
                                    try {
                                        mFloatingActionButton.setImageDrawable(getApplicationContext().getPackageManager().getApplicationIcon(getPackageName()));
                                    } catch (PackageManager.NameNotFoundException e) {
                                        e.printStackTrace();
                                    }
                                    onDoubleClickTwice();
                                }
                                stopDoubleClickHandler();
                            } else {
                                isDoubleClick = false;
                            }

                            mLastPresstime = pressTime;
                            initialX = paramsF.x;
                            initialY = paramsF.y;
                            initialTouchX = event.getRawX();
                            initialTouchY = event.getRawY();
                            break;
                        case MotionEvent.ACTION_UP:
                            long releaseTime = System.currentTimeMillis();
                            Log.d("PressTime", (releaseTime - mLastPresstime) + "");
                            if ((releaseTime - mLastPresstime) > LONG_PRESS_MS_THRESHOLD) {
                                Log.d("Floating button", "LongPress");

                            } else {
                                isLongPress = false;
                                if (isDrag = true) {
                                    if (Math.abs(event.getRawX() - initialTouchX) < BUTTON_DRAG_THRESHOLD && Math.abs(event.getRawY() - initialTouchY) < BUTTON_DRAG_THRESHOLD) {
                                        Log.d("Floating button", "SmallDrag, Dragged x" + (event.getRawX() - initialTouchX) + ", y " + (event.getRawY() - initialTouchY));
                                        isInvalidForClickEvent = false;
                                    } else {
                                        Log.d("Floating button", "LongDrag");
                                        isInvalidForClickEvent = true;
                                    }
                                }
                                startDoubleClickHandler();
                            }
                            break;
                        case MotionEvent.ACTION_MOVE:
                            isDrag = true;
                            paramsF.x = initialX + (int) (event.getRawX() - initialTouchX);
                            paramsF.y = initialY + (int) (event.getRawY() - initialTouchY);
                            windowManager.updateViewLayout(mFloatingActionButton, paramsF);
                            break;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: ");
        return START_STICKY;
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        Log.d(TAG, "onTaskRemoved: ");
        super.onTaskRemoved(rootIntent);
        stopSelf();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: ");
        if (mFloatingActionButton != null) windowManager.removeView(mFloatingActionButton);
        stopDoubleClickHandler();
        if (isDoubleClickTwice) {
            mLastPresstime = System.currentTimeMillis();
            Log.d(TAG, "onDestroy: exportLogcat");
        }

        if (mSplitLogHandler != null) {
            mSplitLogHandler.removeCallbacks(mSplitLog);
            mSplitLogHandler = null;
        }

        super.onDestroy();

    }

    private Handler mDoubleClickHandler = new Handler();

    private Runnable mDoubleClickRunnable = new Runnable() {
        @Override
        public void run() {
            if (!isInvalidForClickEvent && !isDoubleClick && !isLongPress) {
                Log.d("Floating button", "Single Click");
                isInvalidForClickEvent = true;
                isDoubleClick = true;
                isLongPress = true;

                onClick();
            }
            stopDoubleClickHandler();
        }
    };

    private void stopDoubleClickHandler() {
        if (mDoubleClickHandler != null) {
            mDoubleClickHandler.removeCallbacks(mDoubleClickRunnable);
            mDoubleClickHandler = null;
        }
    }

    private void startDoubleClickHandler() {
        stopDoubleClickHandler();
        mDoubleClickHandler = new Handler();
        mDoubleClickHandler.postDelayed(mDoubleClickRunnable, DOUBLECLICK_MS_THRESHOLD);
    }

    private void clearOldLogCat() {
        String command = "logcat -c";
        try {
            Process pr = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void onDoubleClick(){
        clearOldLogCat();
        mSplitLogHandler.postDelayed(mSplitLog, LOG_TIME);

    }

    private void onDoubleClickTwice() {
        mSplitLogHandler.removeCallbacks(mSplitLog);
    }

    private void onClick() {
        Intent intent = new Intent(this, DataActivity.class);
        intent.setFlags(FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


    private final static long LOG_TIME = 1800000L;
    private Handler mSplitLogHandler = new Handler();
    private Runnable mSplitLog = new Runnable() {
        @Override
        public void run() {
            if (isDoubleClick) {
                mLastPresstime = System.currentTimeMillis();
                Log.d(TAG, "ログ分割");
                mExportLogcatFrom = System.currentTimeMillis();
                mSplitLogHandler.postDelayed(this, LOG_TIME);
            }
        }
    };


}
