package com.example.note_application.Notes

class NotesRepository(private val notesDao: NotesData) {
    val allNotes = notesDao.getAllNotes() //our all notes

    // define the insert and delete functions here

    suspend fun insert(note: Notes) {
        notesDao.insert(note)
    }

    suspend fun delete(note: Notes) {
        notesDao.delete(note)
    }

    // Now you can create a view model for your app
}

