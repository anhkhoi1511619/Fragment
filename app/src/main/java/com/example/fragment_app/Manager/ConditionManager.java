package com.example.fragment_app.Manager;

import android.view.View;

import com.example.fragment_app.Data.ConditionEnum;
import com.example.fragment_app.MainActivity;

public class ConditionManager {
    private static final int MAX_NUMBER = 9;
    private static MainActivity mainActivity;
    private static final int VISIBLE = View.VISIBLE;
    private static final int INVISIBLE = View.INVISIBLE;

    private static final int[][] visibleFragmentTable = {
            //                                          OtherFm     Fragment1   Fragment2   Fragment3   Fragment4   Fragment5   Fragment6   Fragment7   Fragment8
            {ConditionEnum.ACTIVE.getFragmentID(),      VISIBLE,    VISIBLE,    VISIBLE,    VISIBLE,    VISIBLE,    VISIBLE,    VISIBLE,    VISIBLE,    VISIBLE},
            {ConditionEnum.LIST.getFragmentID(),        VISIBLE,    INVISIBLE,  INVISIBLE,  INVISIBLE,  INVISIBLE,  INVISIBLE,  INVISIBLE,  INVISIBLE,  INVISIBLE},
            {ConditionEnum.DESIRED_FM.getFragmentID(),  INVISIBLE,  INVISIBLE,  INVISIBLE,  INVISIBLE,  INVISIBLE,  VISIBLE,    INVISIBLE,  INVISIBLE,  INVISIBLE},
    };

    /**
     * 概要：初期化
     *
     * @param mainActivity :　MainActivityのContext
     */
    public void initConditionManager(MainActivity mainActivity) {
        ConditionManager.mainActivity = mainActivity;
    }


    /**
     * 概要：状態移行要求
     *
     * @param conditionEnum :　移行先
     * @return :	true→許可, false→移行不可.
     */
    public void setRequestId(ConditionEnum conditionEnum) {
        int[] arr = setRequestID(conditionEnum);
        mainActivity.displayDesiredPosition(arr);
    }

    /**
     * 　概要：オプションのデータを作成するを処理する
     */
    public static int[] setRequestID(ConditionEnum conditionEnum) {
        int[] visibletable = {0, 0, 0, 0, 0, 0, 0, 0, 0};

        for(int[] visibletable1:visibleFragmentTable){
            if (visibletable1[0] == conditionEnum.getFragmentID()) {
                visibletable = visibletable1;
            }
            System.out.println("Phần tử lớn nhất trong mảng là: ");
        }

//        for (int i = 0; i < MAX_NUMBER; i++) {
//            if (i == pos) {
//                visibletable[i] = 1;
//            }
//        }

        return visibletable;
    }
}
