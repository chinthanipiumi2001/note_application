package com.example.note_application.Notes

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//Room database are abstract class
//annotate the database
//we have create entity
@Database([Notes::class], version =1, exportSchema = false)
abstract class NotesDatabase:RoomDatabase(){
    abstract fun getNoteDao(): Notes
    //we will make a single instance of room database so it prevent multiple opening of database at same time

    companion object {
        // Singleton instance of the database
        @Volatile
        private var INSTANCE: NotesDatabase? = null
        fun getDatabase(context:Context):NotesDatabase{
            return INSTANCE ?: synchronized(this){
                val instantce = Room.databaseBuilder(
                    context.applicationContext,
                    NotesDatabase::class.java,
                    "note database"
                ).build()
                INSTANCE =instantce
                instantce
            }
        }
    }
}




