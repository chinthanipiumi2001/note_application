package com.example.note_application.Notes

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

//Dao are abstract class
//annotate dao
@Dao
abstract class NotesData {
    //we will preform delete insert and get all notes operation through function
    //we want insert and delete to be run on background thread so that while inserting and deleting
    //our app want hang
    //tasks will preform in background
    //annotate the functions

   @Insert(onConflict = OnConflictStrategy.IGNORE)//it will ignore duplicates in notes table
    abstract suspend fun insert(notes: Notes)
    @Delete
    abstract suspend fun delete(notes: Notes)
    @Query("SELECT*FROM notes_table ORDER BY id ASC")//it will select all data from our table according to id ascending order
    abstract fun getAllNotes():LiveData<List<Notes>>//live data store data in real time

}

//this is our data access object to access data
//next we will create database