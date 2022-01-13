package com.sharma.growb.database
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "SalesTable")
public class sales_entity(
    val ItemId:String,
    val NOP:String,
    val Price:String,

    ){
    @PrimaryKey(autoGenerate = true)
    var EntryId:Int=0
}


