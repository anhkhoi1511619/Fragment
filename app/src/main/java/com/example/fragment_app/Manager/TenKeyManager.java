package com.example.fragment_app.Manager;

import android.widget.TextView;

public class TenKeyManager {
    public int MAX_NUM;
    public int MIN_NUM;

    public String inputNumber;
    protected TextView tv;

    public TenKeyManager() {

    }

    public TenKeyManager(int MAX_NUM, int MIN_NUM, TextView tv) {
        this.MAX_NUM = MAX_NUM;
        this.MIN_NUM = MIN_NUM;
        this.tv = tv;
    }

    public TenKeyManager(int MAX_NUM, int MIN_NUM) {
        this.MAX_NUM = MAX_NUM;
        this.MIN_NUM = MIN_NUM;
    }

    public void initialInputNumber() {
        inputNumber = "";
    }
    public String inputKey(int key) {
        if (inputNumber == null) {
            setInitialText();
        }
        inputNumber += String.valueOf(key);
        tv.setText(inputNumber);

        if((Integer.parseInt(inputNumber)) > MAX_NUM) {
            setInitialText();
        }
        return inputNumber;
    }

    public void inputDecideKey() {

    }
    public void inputACKey() {
        setInitialText();
    }
    public TextView getTv() {
        return tv;
    }

    public void setTv(TextView tv) {
        this.tv = tv;
    }

    public void setInitialText() {
        initialInputNumber();
        tv.setText(inputNumber);
    }
}
