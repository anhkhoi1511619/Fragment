package com.example.fragment_app.Data;

import static com.example.fragment_app.Data.FragmentEnum.FM_1;
import static com.example.fragment_app.Data.FragmentEnum.FM_2;
import static com.example.fragment_app.Data.FragmentEnum.FM_3;

import com.example.fragment_app.Manager.ConditionManager;

public class RowButton extends ContactModel{


    public RowButton(String name, boolean display) {
        super(name, display);
    }


    /**
     * 概要：OnClick時の処理
     * @param name:
     * @param display:
     */
    @Override
    public void onButtonClick(String name, boolean display, int pos){


//        switch (name) {
//            case FM_1.getText():
//
//                break;
//            case FM_2:
//                //...
//                break;
//            case FM_3:
//                //...
//                break;
//            default:
//
//        }

        if (name == FM_1.getText()) {
            ConditionManager conditionManager = new ConditionManager();
            conditionManager.setRequestId(1);
        }
    }
}
