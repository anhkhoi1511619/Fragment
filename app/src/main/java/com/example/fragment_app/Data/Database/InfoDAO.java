package com.example.fragment_app.Data.Database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface InfoDAO {

    @Insert
    void insertFragmentInfo(StudentClassModel studentClassModel);

    @Query("SELECT * FROM info")
    List<StudentClassModel> getFMInfo();

    @Query("SELECT * FROM info where mName= :name")
    List<StudentClassModel> checkListContact(String name);

    @Query("DELETE FROM info")
    void deleteFragmentList();

    @Query("SELECT * FROM info WHERE mName LIKE '%' || :name || '%'")
    List<StudentClassModel> searchContact(String name);
}
