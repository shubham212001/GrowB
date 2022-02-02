package com.sharma.growb.addingFragments

import androidx.room.Entity
@Entity(tableName = "Added_Sales_item_table")
public class Add_Sales_Item_entity(
        val BillNo:Int,
        val ItemId:Int,
        val CustomerId:Int,
        val CustomerName:String,
        val itemName:String,
        val NOP:Int,
        val ItemPrice:Int ){
    //Leaving the body empty

}