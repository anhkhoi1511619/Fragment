package com.example.fragment_app.Data.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {ContactModel.class}, version = 1)
public abstract class FMDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "info_fm.db";
    private static FMDatabase instance;

    public static synchronized FMDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), FMDatabase.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
    public abstract InfoDAO infoDAO();
}
