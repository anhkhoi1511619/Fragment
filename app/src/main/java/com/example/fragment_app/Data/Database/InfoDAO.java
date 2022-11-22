package com.example.fragment_app.Data.Database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface InfoDAO {

    @Insert
    void insertFragmentInfo(ContactModel contactModel);

    @Query("SELECT * FROM info")
    List<ContactModel> getFMInfo();

    @Query("SELECT * FROM info where mName= :name")
    List<ContactModel> checkListContact(String name);

    @Query("DELETE FROM info")
    void deleteFragmentList();

    @Query("SELECT * FROM info WHERE mName LIKE '%' || :name || '%'")
    List<ContactModel> searchContact(String name);
}
