package com.example.fragment_app.Data.Database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.ArrayList;

@Entity(tableName = "info")
public class StudentClassModel implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String stdClass;
    private String fullName;
    private boolean isMale;
    private String address;

    public StudentClassModel(String stdClass, String fullName, boolean isMale, String address) {
        this.stdClass = stdClass;
        this.fullName = fullName;
        this.isMale = isMale;
        this.address = address;
    }

    public String getStdClass() {
        return stdClass;
    }

    public void setStdClass(String stdClass) {
        this.stdClass = stdClass;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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


    public static int lastContactId = 0;

    public static ArrayList<StudentClassModel> createContactsList(int numContacts) {
        ArrayList<StudentClassModel> studentClassModels = new ArrayList<StudentClassModel>();

        for (int i = 0; i <= numContacts; i++) {
            studentClassModels.add(new StudentClassModel("Class 10A" + i, "NTA Khoi" + i, true, "Japan"));
        }
        return studentClassModels;
    }

}
