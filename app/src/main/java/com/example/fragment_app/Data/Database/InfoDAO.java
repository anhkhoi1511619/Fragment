package com.example.fragment_app.Data.Database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface InfoDAO {

    @Insert
    void insertFragmentInfo(ContactModel contactModel);

    @Query("SELECT * FROM info")
    List<ContactModel> getFMInfo();
}
