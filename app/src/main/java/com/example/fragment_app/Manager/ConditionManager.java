package com.example.fragment_app.Manager;

import android.os.Handler;

import com.example.fragment_app.MainActivity;

public class ConditionManager {
    private static final int MAX_NUMBER = 9;
    private static MainActivity mainActivity;

    /**
     * 概要：初期化
     *
     * @param mainActivity :　MainActivityのContext
     */
    public void initConditionManager(MainActivity mainActivity){
        ConditionManager.mainActivity = mainActivity;
    }



    /**
     * 概要：状態移行要求
     *
     * @param pos :　移行先
     * @return :	true→許可, false→移行不可.
     */
    public void setRequestId( int pos) {
        int[] arr = createNewArrayFragment(pos);
        arr[0] = 1;
       mainActivity.displayDesiredPosition(arr);
    }
    /**
     *　概要：オプションのデータを作成するを処理する
     */
    public static int[] createNewArrayFragment(int pos) {
        int[] visibletable = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < MAX_NUMBER; i++) {
            if (i == pos) {
                visibletable[i] = 1;
            }
        }

        return visibletable;
    }
}
