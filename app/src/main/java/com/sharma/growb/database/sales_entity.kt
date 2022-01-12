package com.sharma.growb.database
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class sales_entity(
    val ItemId:Int,
    val NOP:Int,
    val Price:Float,

    ){
    @PrimaryKey(autoGenerate = true)
    var EntryId:Int=0
}


