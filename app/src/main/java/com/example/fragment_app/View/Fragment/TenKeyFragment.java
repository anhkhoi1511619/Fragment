package com.example.fragment_app.View.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.fragment_app.R;
import com.example.fragment_app.model.TenKeyModel;

public class TenKeyFragment extends Fragment {

    private static final TenKeyModel tkm = new TenKeyModel();
    public static View myTenKey;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        myTenKey = inflater.inflate(R.layout.fragment_ten_key, container, false);

        initialize();
        // Inflate the layout for this fragment
        return myTenKey;
    }

    private void initialize() {
        // [0]ボタン
        ImageButton bt0Button = myTenKey.findViewById(R.id.tkf_bt0);
        myTenKey.findViewById(R.id.tkf_bt0).findViewById(R.id.tkf_bt0).setOnClickListener(v -> click0Button());

        // [1]ボタン
        ImageButton bt1Button = myTenKey.findViewById(R.id.tkf_bt1);
        myTenKey.findViewById(R.id.tkf_bt1).findViewById(R.id.tkf_bt1).setOnClickListener(v -> click1Button());

        // [2]ボタン
        ImageButton bt2Button = myTenKey.findViewById(R.id.tkf_bt2);
        myTenKey.findViewById(R.id.tkf_bt2).findViewById(R.id.tkf_bt2).setOnClickListener(v -> click2Button());

        // [3]ボタン
        ImageButton bt3Button = myTenKey.findViewById(R.id.tkf_bt3);
        myTenKey.findViewById(R.id.tkf_bt3).findViewById(R.id.tkf_bt3).setOnClickListener(v -> click3Button());

        // [4]ボタン
        ImageButton bt4Button = myTenKey.findViewById(R.id.tkf_bt4);
        myTenKey.findViewById(R.id.tkf_bt4).findViewById(R.id.tkf_bt4).setOnClickListener(v -> click4Button());

        // [5]ボタン
        ImageButton bt5Button = myTenKey.findViewById(R.id.tkf_bt5);
        myTenKey.findViewById(R.id.tkf_bt5).findViewById(R.id.tkf_bt5).setOnClickListener(v -> click5Button());

        // [6]ボタン
        ImageButton bt6Button = myTenKey.findViewById(R.id.tkf_bt6);
        myTenKey.findViewById(R.id.tkf_bt6).findViewById(R.id.tkf_bt6).setOnClickListener(v -> click6Button());

        // [7]ボタン
        ImageButton bt7Button = myTenKey.findViewById(R.id.tkf_bt7);
        myTenKey.findViewById(R.id.tkf_bt7).findViewById(R.id.tkf_bt7).setOnClickListener(v -> click7Button());

        // [8]ボタン
        ImageButton bt8Button = myTenKey.findViewById(R.id.tkf_bt8);
        myTenKey.findViewById(R.id.tkf_bt8).findViewById(R.id.tkf_bt8).setOnClickListener(v -> click8Button());

        // [9]ボタン
        ImageButton bt9Button = myTenKey.findViewById(R.id.tkf_bt9);
        myTenKey.findViewById(R.id.tkf_bt9).findViewById(R.id.tkf_bt9).setOnClickListener(v -> click9Button());

        // [AC]ボタン
        ImageButton btAcButton = myTenKey.findViewById(R.id.tkf_btac);
        myTenKey.findViewById(R.id.tkf_btac).findViewById(R.id.tkf_btac).setOnClickListener(v -> clickAcButton());

        // [確定]ボタン
        ImageButton btDecideButton = myTenKey.findViewById(R.id.tkf_btdecide);
        myTenKey.findViewById(R.id.tkf_btdecide).findViewById(R.id.tkf_btdecide).setOnClickListener(v -> clickDecideButton());

    }

    /**
     * 概要："0"ボタン押下処理
     */
    private void click0Button() {
        int key;
        key = 0;

        callBackNumKey(key);
    }

    /**
     * 概要："1"ボタン押下処理
     */
    private void click1Button() {
        int key;
        key = 1;

        callBackNumKey(key);
    }

    /**
     * 概要："2"ボタン押下処理
     */
    private void click2Button() {
        int key;
        key = 2;

        callBackNumKey(key);
    }

    /**
     * 概要："3"ボタン押下処理
     */
    private void click3Button() {
        int key;
        key = 3;

        callBackNumKey(key);
    }

    /**
     * 概要："4"ボタン押下処理
     */
    private void click4Button() {
        int key;
        key = 4;

        callBackNumKey(key);
    }

    /**
     * 概要："5"ボタン押下処理
     */
    private void click5Button() {
        int key;
        key = 5;

        callBackNumKey(key);
    }

    /**
     * 概要："6"ボタン押下処理
     */
    private void click6Button() {
        int key;
        key = 6;

        callBackNumKey(key);
    }

    /**
     * 概要："7"ボタン押下処理
     */
    private void click7Button() {
        int key;
        key = 7;

        callBackNumKey(key);
    }

    /**
     * 概要："8"ボタン押下処理
     */
    private void click8Button() {
        int key;
        key = 8;

        callBackNumKey(key);
    }

    /**
     * 概要："9"ボタン押下処理
     */
    private void click9Button() {
        int key;
        key = 9;

        callBackNumKey(key);
    }

    /**
     * 概要："AC"ボタン押下処理
     */
    private void clickAcButton() {
        tkm.inputACKey();
    }

    /**
     * 概要："確定"ボタン押下処理
     */
    private void clickDecideButton() {
        tkm.inputDecideKey();
    }



    /**
     * 概要：数字ボタン押下処理()
     * @param numKeyInfo：押下された数字キー情報
     */
    private void callBackNumKey(int numKeyInfo) {
        tkm.inputTenKey(numKeyInfo);
    }


}