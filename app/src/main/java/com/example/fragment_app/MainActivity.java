package com.example.fragment_app;

import static com.example.fragment_app.Manager.ConditionManager.createNewArrayFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.fragment_app.Data.ConditionEnum;
import com.example.fragment_app.Manager.ConditionManager;
import com.example.fragment_app.View.Fragment.CommunicationFragment;
import com.example.fragment_app.View.Fragment.Fragment1;
import com.example.fragment_app.View.Fragment.Fragment2;
import com.example.fragment_app.View.Fragment.Fragment3;
import com.example.fragment_app.View.Fragment.Fragment4;
import com.example.fragment_app.View.Fragment.Fragment5;
import com.example.fragment_app.View.Fragment.Fragment6;
import com.example.fragment_app.View.Fragment.Fragment7;
import com.example.fragment_app.View.Fragment.Fragment8;
import com.example.fragment_app.Manager.FragmentManager;
import com.example.fragment_app.View.Fragment.OtherFragment;

public class MainActivity extends AppCompatActivity {

    private static final String MY_REQUEST_CODE = "MY_REQUEST_CODE";
    private static final int INVISIBLE = View.INVISIBLE;
    private static final int VISIBLE = View.VISIBLE;
    protected static int[] arrayFragment = null;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getBaseContext();

        //Dummy Data
        setFragmentInstance();
        arrayFragment = createNewArrayFragment(ConditionEnum.ACTIVE);
        displayDesiredPosition(arrayFragment);

        // ConditionManager初期化
        initConditionManager();


        Button removeBtn = (Button) findViewById(R.id.btn_fragment5);
        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, getString(R.string.click1), Toast.LENGTH_SHORT).show();
                clickFragment5Btn();
            }
        });

        Button addAllBtn = (Button) findViewById(R.id.btn_add_total);
        addAllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, getString(R.string.click2), Toast.LENGTH_SHORT).show();
                clickAllFragmentBtn();
            }
        });

        Button disListBtn = (Button) findViewById(R.id.btn_dis_list);
        disListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, getString(R.string.click3), Toast.LENGTH_SHORT).show();
                clickDisListBtn();
            }
        });

        Button connectDB = (Button) findViewById(R.id.btn_connectDB);
        connectDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, getString(R.string.click4), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, DataActivity.class);
//                Bundle bundle = new Bundle();
//                List<ContactModel> mListUser = ContactModel.createContactsList(7);
//                bundle.putSerializable(MY_REQUEST_CODE, mListUser);
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getBaseContext(), getString(R.string.request), Toast.LENGTH_LONG).show();
    }

    private void initConditionManager() {
        ConditionManager cm = new ConditionManager();
        cm.initConditionManager(this);
    }


    /**
     * 概要:表示を処理する
     */
    public void displayDesiredPosition(int[] arrayFragment) {

        androidx.fragment.app.FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        //Other Fragment
        OtherFragment otherFragment = FragmentManager.getOtherFragment();
        if (arrayFragment[1] == VISIBLE) {
            fragmentTransaction.show(otherFragment);
            otherFragment.changeConditionID(ConditionEnum.ACTIVE);
        } else {
            fragmentTransaction.hide(otherFragment);
        }
        //Fragment1
        Fragment1 fragment1 = FragmentManager.getFragment1();
        if (arrayFragment[2] == VISIBLE) {
            fragmentTransaction.show(fragment1);
        } else {
            fragmentTransaction.hide(fragment1);
        }
        //Fragment2
        Fragment2 fragment2 = FragmentManager.getFragment2();
        if (arrayFragment[3] == VISIBLE) {
            fragmentTransaction.show(fragment2);
        } else {
            fragmentTransaction.hide(fragment2);
        }

        //Fragment3
        Fragment3 fragment3 = FragmentManager.getFragment3();
        if (arrayFragment[4] == VISIBLE) {
            fragmentTransaction.show(fragment3);
        } else {
            fragmentTransaction.hide(fragment3);
        }

        //Fragment4
        Fragment4 fragment4 = FragmentManager.getFragment4();
        if (arrayFragment[5] == VISIBLE) {
            fragmentTransaction.show(fragment4);
        } else {
            fragmentTransaction.hide(fragment4);
        }

        //Fragment5
        Fragment5 fragment5 = FragmentManager.getFragment5();
        if (arrayFragment[6] == VISIBLE) {
            fragmentTransaction.show(fragment5);
        } else {
            fragmentTransaction.hide(fragment5);
        }

        //Fragment6
        Fragment6 fragment6 = FragmentManager.getFragment6();
        if (arrayFragment[7] == VISIBLE) {
            fragmentTransaction.show(fragment6);
        } else {
            fragmentTransaction.hide(fragment6);
        }

        //Fragment7
        Fragment7 fragment7 = FragmentManager.getFragment7();
        if (arrayFragment[8] == VISIBLE) {
            fragmentTransaction.show(fragment7);
        } else {
            fragmentTransaction.hide(fragment7);
        }

        //Fragment8
        Fragment8 fragment8 = FragmentManager.getFragment8();
        if (arrayFragment[9] == VISIBLE) {
            fragmentTransaction.show(fragment8);
        } else {
            fragmentTransaction.hide(fragment8);
        }
        fragmentTransaction.commit();
    }

    private void clickDisListBtn() {
        arrayFragment = createNewArrayFragment(ConditionEnum.LIST);
        displayDesiredPosition(arrayFragment);
    }

    /**
     * 概要:[すべてのフラグメントを表示] ボタンをクリックしたときの表示を処理する
     */
    private void clickAllFragmentBtn() {
        arrayFragment = createNewArrayFragment(ConditionEnum.ACTIVE);
        displayDesiredPosition(arrayFragment);
    }

    /**
     * 　概要：[要求のフラグメントを表示] ボタンをクリックしたときの表示を処理する
     */
    private void clickFragment5Btn() {

        //Dummy Data
        arrayFragment = createNewArrayFragment(ConditionEnum.DESIRED_FM);
        displayDesiredPosition(arrayFragment);

    }


    /**
     * 　概要：最初からフラグメントを作成するを処理する
     */
    private void setFragmentInstance() {
        androidx.fragment.app.FragmentManager fragmentManager = getSupportFragmentManager();
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
        CommunicationFragment communicationFragment = (CommunicationFragment) fragmentManager.findFragmentById(R.id.fm_test);

        FragmentManager.setFragment1(fragment1);
        FragmentManager.setFragment2(fragment2);
        FragmentManager.setFragment3(fragment3);
        FragmentManager.setFragment4(fragment4);
        FragmentManager.setFragment5(fragment5);
        FragmentManager.setFragment6(fragment6);
        FragmentManager.setFragment7(fragment7);
        FragmentManager.setFragment8(fragment8);
        FragmentManager.setOtherFragment(otherFragment);
        FragmentManager.setCommunicationFragment(communicationFragment);

    }

}