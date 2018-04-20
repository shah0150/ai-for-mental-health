package com.algonquincollege.smyt0058.oso.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Jason on 2018-04-10.
 */
@Dao
public interface UserDAO {

    @Query("SELECT * FROM user")
    List<UserChat> getAllUsers();

    @Insert
    void insertAll(UserChat... users);

}
