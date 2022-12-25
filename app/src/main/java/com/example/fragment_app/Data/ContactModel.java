package com.example.fragment_app.Data;

import com.example.fragment_app.Manager.ConditionManager;

import java.util.ArrayList;

public class ContactModel {

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

    /**
     * 概要：OnClick時の処理
     * @param name:
     * @param display:
     */
    public void onButtonClick(String name, boolean display, int pos){
        ConditionManager conditionManager = new ConditionManager();

        //Ignore Other Fragment
        conditionManager.setRequestId(pos + 1);
    }

    public void setDisplay(boolean mDisplay) {
        this.mDisplay = mDisplay;
    }

    private static int lastContactId = 0;
    public static ArrayList<ContactModel> createContactsList(int numContacts) {
        ArrayList<ContactModel> contactModels = new ArrayList<ContactModel>();

        for (int i = 0; i <= numContacts; i++) {
            contactModels.add(new ContactModel("Fragment" + ++lastContactId, (i!= 5)));
        }
        return  contactModels;
    }

}
