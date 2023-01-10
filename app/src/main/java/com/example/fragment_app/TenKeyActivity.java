package com.example.fragment_app;

import static com.example.fragment_app.View.Fragment.TenKeyFragment.myTenKey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fragment_app.Manager.FragmentManager;
import com.example.fragment_app.Manager.TenKeyManager;
import com.example.fragment_app.model.TenKeyModel;

public class TenKeyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenkey);

    }

    @Override
    protected void onResume() {
        super.onResume();
        TenKeyModel tenKeyModel = new TenKeyModel();
        TenKeyManager tenKeyManager = new TenKeyManager(100,200, myTenKey.findViewById(R.id.tvTest));
        tenKeyModel.setTenKeyManager(tenKeyManager);
    }
}