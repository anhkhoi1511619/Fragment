package com.example.fragment_app.Data.Database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.ArrayList;

@Entity(tableName = "info")
public class StudentClassModel implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String mName;
    private boolean mDisplay;

    public StudentClassModel(String name, boolean display) {
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
//        ConditionManager conditionManager = new ConditionManager();
//
//        //Ignore Other Fragment
//        conditionManager.setRequestId(pos + 1);
    }

    public void setDisplay(boolean mDisplay) {
        this.mDisplay = mDisplay;
    }

    public static int lastContactId = 0;

    public static ArrayList<StudentClassModel> createContactsList(int numContacts) {
        ArrayList<StudentClassModel> studentClassModels = new ArrayList<StudentClassModel>();

        for (int i = 0; i <= numContacts; i++) {
            studentClassModels.add(new StudentClassModel("Fragment" + ++lastContactId, (i != 5)));
        }
        return studentClassModels;
    }

}
