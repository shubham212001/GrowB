package com.sharma.growb.database

import androidx.room.Entity
import androidx.room.PrimaryKey
data class item (
    val bill_no:String,
    val Item_Id:String,
    val Customer_Id:String,
    val Customer_Name:String,
    val No_of_purchase:String,
    val item_selling_price:String   ){
    //Leaving the empty body
}
