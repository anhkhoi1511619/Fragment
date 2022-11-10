package com.example.fragment_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fragment_app.Data.Database.ContactModel;
import com.example.fragment_app.Data.Database.FMDatabase;
import com.example.fragment_app.View.Fragment.OtherFragment;
import com.example.fragment_app.View.OtherRecycleView.OtherAdapter;

import java.util.List;

public class DataActivity extends AppCompatActivity {

    private List<ContactModel> mListFM;
    private RecyclerView rcvFragmentInfo;
    private OtherAdapter otherAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        rcvFragmentInfo = findViewById(R.id.rv_user);

        mListFM = ContactModel.createContactsList(7);
        otherAdapter = new OtherAdapter(this, mListFM);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvFragmentInfo.setLayoutManager(linearLayoutManager);
        rcvFragmentInfo.setAdapter(otherAdapter);

//        loadData();


    }

    private void loadData() {
        mListFM = FMDatabase.getInstance(this).infoDAO().getFMInfo();
        otherAdapter = new OtherAdapter(this, mListFM);
    }
}