package com.example.mypayment;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class UserDatabase extends SQLiteOpenHelper {


    public static final String USERS_TABLE = "USERS_TABLE";
    public static final String COLUMN_USERS_NAME = "USERS_NAME";
    public static final String COLUMN_USERS_AMOUNT = "USERS_AMOUNT";
    public static final String COLUMN_ID = "ID";

    public UserDatabase(@Nullable Context context) {
        super(context, "details.db", null,1);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement= "CREATE TABLE " + USERS_TABLE + "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_USERS_NAME + " TEXT," + COLUMN_USERS_AMOUNT + " INT)";
        db.execSQL(createTableStatement);

    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public boolean addOne(ClientModel clientModel){
        SQLiteDatabase db= this.getReadableDatabase();
        ContentValues cv= new ContentValues();
        cv.put(COLUMN_USERS_NAME,clientModel.getUsername());
        cv.put(COLUMN_USERS_AMOUNT,clientModel.getAmount());

        long insert = db.insert(USERS_TABLE, null, cv);
        if(insert==-1){
            return  false;
        }
        else {
            return true;
        }


    }
    public List<ClientModel> getAll(){
        List<ClientModel>returnList= new ArrayList<>();

        String queryString="SELECT * FROM "+USERS_TABLE;
        SQLiteDatabase db= this.getReadableDatabase();

        return returnList;
    }
}