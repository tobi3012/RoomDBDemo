package com.example.hieptq.roomdbdemo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by HiepTQ on 2/26/2019.
 */

@Dao
public interface UserDAO {

    @Query("SELECT * FROM user")
    List<User> getAllUsers();

    @Insert
    void insertAll(User... users);
}
