package com.example.offlinedatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper
{
    public DBHelper(@Nullable Context context) {
        super(context, "demo", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String qry = "create table contactbook (id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,contact TEXT)";
        sqLiteDatabase.execSQL(qry);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insertData(String name, String contact) {
        String qry = "insert into contactbook (name, contact) values ('"+name+"','"+contact+"')";
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL(qry);
    }
}
