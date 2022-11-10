package com.example.fragment_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragment_app.Data.Database.ContactModel;
import com.example.fragment_app.Data.Database.FMDatabase;
import com.example.fragment_app.View.Fragment.OtherFragment;
import com.example.fragment_app.View.OtherRecycleView.OtherAdapter;

import java.util.List;

public class DataActivity extends AppCompatActivity {

    private List<ContactModel> mListFM;
    private RecyclerView rcvFragmentInfo;
    private OtherAdapter otherAdapter;
    private Button btnAddFragment;
    private EditText edtName;
    private EditText edtDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        initUI();
        btnAddFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addInfoFragment();
            }
        });

//        ContactModel.lastContactId = 0;
//        mListFM = ContactModel.createContactsList(7);
//        otherAdapter = new OtherAdapter(this, mListFM);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        rcvFragmentInfo.setLayoutManager(linearLayoutManager);
//        rcvFragmentInfo.setAdapter(otherAdapter);

        loadData();


    }

    private void addInfoFragment() {
        String strName = edtName.getText().toString().trim();
        String strDisplay = edtDisplay.getText().toString().trim();

        ContactModel contactModel = new ContactModel(strName, (strDisplay == "OK"));
        FMDatabase.getInstance(this).infoDAO().insertFragmentInfo(contactModel);

        Toast.makeText(this, "Add Fragment successfully", Toast.LENGTH_SHORT).show();

        //Set empty edittext
        edtName.setText("");
        edtDisplay.setText("");
        // Hide keyboard
        hideSoftKeyboard();
        //Show Result again
        loadData();
    }

    private void initUI() {
        rcvFragmentInfo = findViewById(R.id.rv_fragment_name);
        edtName = findViewById(R.id.edit_fragment_name);
        edtDisplay = findViewById(R.id.edit_display);
        btnAddFragment = findViewById(R.id.btn_add_fragment);
    }

    private void loadData() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvFragmentInfo.setLayoutManager(linearLayoutManager);
        mListFM = FMDatabase.getInstance(this).infoDAO().getFMInfo();
        otherAdapter = new OtherAdapter(this, mListFM);
        rcvFragmentInfo.setAdapter(otherAdapter);
    }

    private void hideSoftKeyboard(){
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}