package com.example.note_application.Notes

import androidx.room.Database
import androidx.room.RoomDatabase

//Room database are abstract class
//annotate the database
//we have create entity
//
@Database(entities = [Notes::class], version =1, exportSchema = false)
abstract class NotesDatabase:RoomDatabase() {
}