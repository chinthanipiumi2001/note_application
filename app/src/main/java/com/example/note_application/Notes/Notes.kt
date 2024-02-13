package com.example.note_application.Notes

import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

//this will create an entity table
//entity class is data class
//lets annotate the class
//It will create a table to store our notes
//name this table
@Entity(tableName ="notes_table")
//our table will have
 data class Notes(@ColumnInfo(name ="text")val text:String) {
  //we will access data according to the id of the objet
  //we want id to be auto generate
  @PrimaryKey(autoGenerate = true)var id =0
}
//this is our entity
//now let's create dao to access data
