package com.example.fragment_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.fragment_app.View.Fragment.Fragment1;
import com.example.fragment_app.View.Fragment.Fragment2;
import com.example.fragment_app.View.Fragment.Fragment3;
import com.example.fragment_app.View.Fragment.Fragment4;
import com.example.fragment_app.View.Fragment.Fragment5;
import com.example.fragment_app.View.Fragment.Fragment6;
import com.example.fragment_app.View.Fragment.Fragment7;
import com.example.fragment_app.View.Fragment.Fragment8;
import com.example.fragment_app.View.Fragment.Manager.LecipFragmentManager;
import com.example.fragment_app.View.Fragment.OtherFragment;

public class MainActivity extends AppCompatActivity {

    private static final int MAX_NUMBER = 9;
    private static final int INVISIBLE = 0;
    private static final int VISIBLE = 1;
    protected int[] arrayFragment = null;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getBaseContext();

        //Dummy Data
        setFragmentInstance();
        arrayFragment = createNewArrayFragment(-1);
        displayDesiredPosition(arrayFragment);


        Button removeBtn = (Button) findViewById(R.id.btn_fragment5);
        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, getString(R.string.click1), Toast.LENGTH_LONG).show();
                clickFragment5Btn();
            }
        });

        Button addAllBtn = (Button) findViewById(R.id.btn_add_total);
        addAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, getString(R.string.click2), Toast.LENGTH_LONG).show();
                clickAllFragmentBtn();
            }
        });

        Button disListBtn = (Button) findViewById(R.id.btn_dis_list);
        disListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, getString(R.string.click3), Toast.LENGTH_LONG).show();
                clickDisListBtn();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getBaseContext(), getString(R.string.request), Toast.LENGTH_LONG).show();
    }

    /**
     * 概要:表示を処理する
     */
    private void displayDesiredPosition(int[] arrayFragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        //Other Fragment
        OtherFragment otherFragment = LecipFragmentManager.getOtherFragment();
        if (arrayFragment[0] == VISIBLE) {
            fragmentTransaction.show(otherFragment);
//                    fragmentTransaction.add(R.id.frame_layout1, new Fragment2());
        } else {
            fragmentTransaction.hide(otherFragment);
        }
        //Fragment1
        Fragment1 fragment1 = LecipFragmentManager.getFragment1();
        if (arrayFragment[1] == VISIBLE) {
            fragmentTransaction.show(fragment1);
//                    fragmentTransaction.add(R.id.frame_layout1, new Fragment2());
        } else {
            fragmentTransaction.hide(fragment1);
        }
        //Fragment2
        Fragment2 fragment2 = LecipFragmentManager.getFragment2();
        if (arrayFragment[2] == VISIBLE) {
            fragmentTransaction.show(fragment2);
//                    fragmentTransaction.add(R.id.frame_layout2, fragment1);
        } else {
            fragmentTransaction.hide(fragment2);
        }

        //Fragment3
        Fragment3 fragment3 = LecipFragmentManager.getFragment3();
        if (arrayFragment[3] == VISIBLE) {
            fragmentTransaction.show(fragment3);
//                    fragmentTransaction.add(R.id.frame_layout3, new Fragment2());
        } else {
            fragmentTransaction.hide(fragment3);
        }

        //Fragment4
        Fragment4 fragment4 = LecipFragmentManager.getFragment4();
        if (arrayFragment[4] == VISIBLE) {
            fragmentTransaction.show(fragment4);
//                    fragmentTransaction.add(R.id.frame_layout4, new Fragment2());
        } else {
            fragmentTransaction.hide(fragment4);
        }

        //Fragment5
        Fragment5 fragment5 = LecipFragmentManager.getFragment5();
        if (arrayFragment[5] == VISIBLE) {
            fragmentTransaction.show(fragment5);
//                    fragmentTransaction.add(R.id.frame_layout5, fragment2);
        } else {
            fragmentTransaction.hide(fragment5);
        }

        //Fragment6
        Fragment6 fragment6 = LecipFragmentManager.getFragment6();
        if (arrayFragment[6] == VISIBLE) {
            fragmentTransaction.show(fragment6);
//                    fragmentTransaction.add(R.id.frame_layout5, new Fragment2());
        } else {
            fragmentTransaction.hide(fragment6);
        }

        //Fragment7
        Fragment7 fragment7 = LecipFragmentManager.getFragment7();
        if (arrayFragment[7] == VISIBLE) {
            fragmentTransaction.show(fragment7);
//                    fragmentTransaction.add(R.id.frame_layout6, new Fragment2());
        } else {
            fragmentTransaction.hide(fragment7);
        }

        //Fragment8
        Fragment8 fragment8 = LecipFragmentManager.getFragment8();
        if (arrayFragment[8] == VISIBLE) {
            fragmentTransaction.show(fragment8);
//                    fragmentTransaction.add(R.id.frame_layout7, new Fragment2());
        } else {
            fragmentTransaction.hide(fragment8);
        }
        fragmentTransaction.commit();
    }

    private void clickDisListBtn() {
        arrayFragment = createNewArrayFragment(0);
        displayDesiredPosition(arrayFragment);
    }

    /**
     * 概要:[すべてのフラグメントを表示] ボタンをクリックしたときの表示を処理する
    */
    private void clickAllFragmentBtn() {
        int[] totalFragment = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        displayDesiredPosition(totalFragment);
    }
    /**
     *　概要：[要求のフラグメントを表示] ボタンをクリックしたときの表示を処理する
     */
    private void clickFragment5Btn() {

        //Dummy Data
        arrayFragment = createNewArrayFragment(5);
        displayDesiredPosition(arrayFragment);

    }

    /**
     *　概要：オプションのデータを作成するを処理する
     */
    private static int[] createNewArrayFragment(int pos) {
        int[] visibletable = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < MAX_NUMBER; i++) {
            if (i == pos) {
                visibletable[i] = 1;
            }
        }

        return visibletable;
    }


    /**
     *　概要：最初からフラグメントを作成するを処理する
     */
    private void setFragmentInstance() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment1 fragment1 = (Fragment1) fragmentManager.findFragmentById(R.id.frame_layout1);
        Fragment2 fragment2 = (Fragment2) fragmentManager.findFragmentById(R.id.frame_layout2);
        Fragment3 fragment3 = (Fragment3) fragmentManager.findFragmentById(R.id.frame_layout3);
        Fragment4 fragment4 = (Fragment4) fragmentManager.findFragmentById(R.id.frame_layout4);
        Fragment5 fragment5 = (Fragment5) fragmentManager.findFragmentById(R.id.frame_layout5);
        Fragment6 fragment6 = (Fragment6) fragmentManager.findFragmentById(R.id.frame_layout6);
        Fragment7 fragment7 = (Fragment7) fragmentManager.findFragmentById(R.id.frame_layout7);
        Fragment8 fragment8 = (Fragment8) fragmentManager.findFragmentById(R.id.frame_layout8);
        //
        OtherFragment otherFragment = (OtherFragment) fragmentManager.findFragmentById(R.id.frame_layout);

        LecipFragmentManager.setFragment1(fragment1);
        LecipFragmentManager.setFragment2(fragment2);
        LecipFragmentManager.setFragment3(fragment3);
        LecipFragmentManager.setFragment4(fragment4);
        LecipFragmentManager.setFragment5(fragment5);
        LecipFragmentManager.setFragment6(fragment6);
        LecipFragmentManager.setFragment7(fragment7);
        LecipFragmentManager.setFragment8(fragment8);
        LecipFragmentManager.setOtherFragment(otherFragment);

    }

}