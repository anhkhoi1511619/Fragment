package com.example.fragment_app.model;

import android.widget.TextView;

import com.example.fragment_app.Manager.TenKeyManager;

public class TenKeyModel {
    private static TenKeyManager tenKeyManager;

    public TenKeyManager getTenKeyManager() {
        return tenKeyManager;
    }

    public void setTenKeyManager(TenKeyManager tenKeyManager) {
        this.tenKeyManager = tenKeyManager;
    }

    public void inputTenKey(int key) {
        String inputkey = tenKeyManager.inputKey(key);
        TextView textView = tenKeyManager.getTv();

        if (textView != null) {
            textView.setText(inputkey);
        }
    }

    public void inputACKey() {
        tenKeyManager.inputACKey();
    }

    public void inputDecideKey() {
        tenKeyManager.inputDecideKey();
    }
}
