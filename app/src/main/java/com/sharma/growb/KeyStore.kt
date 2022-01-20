package com.sharma.growb

import android.content.Context
import android.content.SharedPreferences
import android.util.Log


class Keystore private constructor(context: Context) {
    private val SP: SharedPreferences
    fun put(key: String?, value: String?) { //Log.v("Keystore","PUT "+key+" "+value);
        val editor = SP.edit()
        editor.putString(key, value)
        editor.commit() // Stop everything and do an immediate save!
        // editor.apply();//Keep going and save when you are not busy - Available only in APIs 9 and above.  This is the preferred way of saving.
    }

    operator fun get(key: String?): String? { //Log.v("Keystore","GET from "+key);
        return SP.getString(key, null)
    }

    fun getInt(key: String?): Int { //Log.v("Keystore","GET INT from "+key);
        return SP.getInt(key, 0)
    }

    fun putInt(key: String?, num: Int) { //Log.v("Keystore","PUT INT "+key+" "+String.valueOf(num));
        val editor = SP.edit()
        editor.putInt(key, num)
        editor.commit()
    }

    fun clear() { // Delete all shared preferences
        val editor = SP.edit()
        editor.clear()
        editor.commit()
    }

    fun remove() { // Delete only the shared preference that you want
        val editor = SP.edit()
        editor.remove(filename)
        editor.commit()
    }

    companion object {
        //Did you remember to vote up my example?
        private var store: Keystore? = null
        private const val filename = "Keys"
        fun getInstance(context: Context): Keystore? {
            if (store == null) {
                Log.v("Keystore", "NEW STORE")
                store = Keystore(context)
            }
            return store
        }
    }

    init {
        SP = context.applicationContext.getSharedPreferences(filename, 0)
    }
}