package com.sharma.growb.database

import androidx.lifecycle.LiveData
import androidx.room.*
@Dao
   public interface dao {

        @Insert
        suspend fun add_sales(input: sales_entity): Long


        @Query("Select * from SalesTable order by EntryId DESC")
        fun get_all(): LiveData<List<sales_entity>>

//        @Query("Select * from entity order by id ASC")
//        fun get_all1(): LiveData<List<entity>>

        //Query for deletion of an item from the list
        @Delete
        suspend fun delete_task(input: sales_entity)

        @Update
        suspend fun update_task(input: sales_entity)
    }
