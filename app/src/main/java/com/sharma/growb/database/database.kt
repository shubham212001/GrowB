package com.sharma.growb.database


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.internal.synchronized

@Database(entities=[sales_entity::class], version = 1,exportSchema = false)
abstract class database : RoomDatabase() {
    abstract fun Dao(): dao




    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: database? = null

        fun getDatabase(context: Context): database {
//            val tempInstance = INSTANCE
//            if (tempInstance != null) {
//                return tempInstance
//            }
//            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    database::class.java,
                    "Appdatabase"
                ).build()
                INSTANCE = instance
                return instance
            }
        //}
    }

}
