 
package com.example.sa; 
 
import android.content.ContentValues; 
import android.content.Context; 
import android.database.sqlite.SQLiteDatabase; 
import android.database.sqlite.SQLiteOpenHelper; 
 
import androidx.annotation.Nullable; 
 
public class Database extends SQLiteOpenHelper { 
    public Database(@Nullable Context context, @Nullable String name, @Nullable 
SQLiteDatabase.CursorFactory factory, int version) { 
        super(context, name, factory, version); 
    } 
 
    @Override 
    public void onCreate(SQLiteDatabase sqLiteDatabase) { 
        String qry1 = "create table users(username text,email text,password text)"; 
        sqLiteDatabase.execSQL(qry1); 
    } 
 
    @Override 
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) { 
 
    } 
    public void createAcc(String username,String email,String password){ 
        ContentValues cv = new ContentValues(); 
        cv.put("username",username); 
        cv.put("email",email); 
        cv.put("password",password); 
        SQLiteDatabase db = getWritableDatabase(); 
        db.insert("users",null,cv); 
        db.close(); 
    } 
} 
 