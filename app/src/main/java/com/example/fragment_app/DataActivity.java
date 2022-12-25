package com.example.fragment_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragment_app.Data.Database.ContactModel;
import com.example.fragment_app.Data.Database.FMDatabase;
import com.example.fragment_app.Data.Database.iSendDataListener;
import com.example.fragment_app.Manager.LecipFragmentManager;
import com.example.fragment_app.View.Fragment.CommunicationFragment;
import com.example.fragment_app.View.Fragment.OtherFragment;
import com.example.fragment_app.View.OtherRecycleView.OtherAdapter;

import java.util.ArrayList;
import java.util.List;

public class DataActivity extends AppCompatActivity implements iSendDataListener {

    private List<ContactModel> mListFM;
    private RecyclerView rcvFragmentInfo;
    private OtherAdapter otherAdapter;
    private Button btnAddFragment;
    private EditText edtName;
    private Button btnDisplay;
    private TextView btnAllFragmentList;
    private EditText edtSearchName;
    private boolean isDisplay = true;



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
        btnAllFragmentList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteAllFragmentList();
            }
        });
        edtSearchName.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == EditorInfo.IME_ACTION_SEARCH) {
                    //Logic Search
                    String strResult = textView.getText().toString().trim();
                    handleSearchContact();
                }
                return false;
            }
        });

//        ContactModel.lastContactId = 0;
//        mListFM = ContactModel.createContactsList(7);
//        otherAdapter = new OtherAdapter(this, mListFM);

        mListFM = FMDatabase.getInstance(this).infoDAO().getFMInfo();
        otherAdapter = new OtherAdapter(this, mListFM);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcvFragmentInfo.setLayoutManager(linearLayoutManager);
        rcvFragmentInfo.setAdapter(otherAdapter);
        loadData();


    }

    private void handleSearchContact() {
        String strSearchName = edtSearchName.getText().toString().trim();
        mListFM = new ArrayList<>();
        mListFM = FMDatabase.getInstance(this).infoDAO().searchContact(strSearchName);
        otherAdapter.setData(mListFM);
    }

    private void deleteAllFragmentList() {
        FMDatabase.getInstance(this).infoDAO().deleteFragmentList();
        mListFM = FMDatabase.getInstance(this).infoDAO().getFMInfo();
        loadData();
    }

    private void addInfoFragment() {
        String strName = edtName.getText().toString().trim();

        ContactModel contactModel = new ContactModel(strName, isDisplay());

        if (isNameExit(strName)) {
            //Set empty edittext
            return;
        }
        FMDatabase.getInstance(this).infoDAO().insertFragmentInfo(contactModel);

        Toast.makeText(this, "Add Fragment successfully", Toast.LENGTH_SHORT).show();
        edtName.setText("");
        Toast.makeText(this, "Fragment Name exits", Toast.LENGTH_SHORT).show();

        // Hide keyboard
        hideSoftKeyboard();
        //Show Result again
        loadData();


        //Add communication between activity and fragment
//        Bundle bundle = new Bundle();
//        bundle.putSerializable("object_contactmodel", contactModel);

        //Create new Fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
//        CommunicationFragment communicationFragment = new CommunicationFragment();
//        communicationFragment.setArguments(bundle);
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fm_test, CommunicationFragment.getInstance(contactModel, this));
        fragmentTransaction.commit();

    }

    private boolean isNameExit(String name) {
        List<ContactModel> contactModels = FMDatabase.getInstance(this).infoDAO().checkListContact(name);
        return (contactModels != null && !contactModels.isEmpty());
    }

    private void initUI() {
        rcvFragmentInfo = findViewById(R.id.rv_fragment_name);
        edtName = findViewById(R.id.edit_fragment_name);
        btnDisplay = findViewById(R.id.btn_display);
        btnAddFragment = findViewById(R.id.btn_add_fragment);
        btnAllFragmentList = findViewById(R.id.tv_delete_all);
        edtSearchName = findViewById(R.id.edt_search);
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isDisplay()) {
                    btnDisplay.setEnabled(false);
                } else {
                    btnDisplay.setEnabled(true);
                }
                setDisplay(btnDisplay.isEnabled());
            }
        });
    }

    private void loadData() {
        mListFM = FMDatabase.getInstance(this).infoDAO().getFMInfo();
        otherAdapter.setData(mListFM);
    }

    private void hideSoftKeyboard(){
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }

    public boolean isDisplay() {
        return isDisplay;
    }

    public void setDisplay(boolean display) {
        isDisplay = display;
    }

    @Override
    public void sendData(ContactModel contactModel) {
        edtName.setText(contactModel.getName());
        btnDisplay.setEnabled(contactModel.isDisplay());
    }
}