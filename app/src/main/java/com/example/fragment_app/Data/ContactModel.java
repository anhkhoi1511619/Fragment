package com.example.fragment_app.Data;

import java.util.ArrayList;

public class ContactModel {

    private String mName;
    private boolean mOnline;

    public ContactModel(String name, boolean online) {
        mName = name;
        mOnline = online;
    }
    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public boolean isOnline() {
        return mOnline;
    }

    public void setOnline(boolean mOnline) {
        this.mOnline = mOnline;
    }

    private static int lastContactId = 0;
    public static ArrayList<ContactModel> createContactsList(int numContacts) {
        ArrayList<ContactModel> contactModels = new ArrayList<ContactModel>();

        for (int i = 0; i <= numContacts; i++) {
            contactModels.add(new ContactModel("Person" + ++lastContactId, i <= lastContactId/2));
        }
        return  contactModels;
    }

}
