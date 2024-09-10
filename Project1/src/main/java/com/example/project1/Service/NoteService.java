package com.example.project1.Service;

import java.util.List;

import com.example.project1.Entity.Note;

public interface NoteService {
    
    public List<Note> getAllNotes();

    public Note getNoteById(long id);

    public Note addNote(Note note);

    public Note updateNote(long noteId, Note note);

    public void deleteNote(long noteId);
}
