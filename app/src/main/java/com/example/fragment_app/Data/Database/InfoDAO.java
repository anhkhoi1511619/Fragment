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

    @Query("SELECT * FROM info where stdClass= :mClass")
    List<StudentClassModel> checkListContact(String mClass);

    @Query("DELETE FROM info")
    void deleteFragmentList();

    @Query("SELECT * FROM info WHERE stdClass LIKE '%' || :mClass || '%'")
    List<StudentClassModel> searchContact(String mClass);
}
