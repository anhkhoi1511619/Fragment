package com.example.fragment_app.Data.Database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.fragment_app.Manager.ConditionManager;

import java.util.ArrayList;

@Entity(tableName = "info")
public class ContactModel {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String mName;
    private boolean mDisplay;

    public ContactModel(String name, boolean display) {
        mName = name;
        mDisplay = display;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public boolean isDisplay() {
        return mDisplay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * 概要：OnClick時の処理
     *
     * @param name:
     * @param display:
     */
    public void onButtonClick(String name, boolean display, int pos) {
        ConditionManager conditionManager = new ConditionManager();

        //Ignore Other Fragment
        conditionManager.setRequestId(pos + 1);
    }

    public void setDisplay(boolean mDisplay) {
        this.mDisplay = mDisplay;
    }

    public static int lastContactId = 0;

    public static ArrayList<ContactModel> createContactsList(int numContacts) {
        ArrayList<ContactModel> contactModels = new ArrayList<ContactModel>();

        for (int i = 0; i <= numContacts; i++) {
            contactModels.add(new ContactModel("Fragment" + ++lastContactId, (i != 5)));
        }
        return contactModels;
    }

}
