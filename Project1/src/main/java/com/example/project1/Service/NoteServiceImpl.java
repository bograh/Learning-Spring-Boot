package com.example.project1.Service;

import com.example.project1.Entity.Note;
import com.example.project1.Repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(long noteId) {
        return noteRepository.findById(noteId).orElse(null);
    }

    @Override
    public Note addNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public Note updateNote(long noteId, Note note) {
        Note noteDB = noteRepository.findById(noteId).orElse(null);
        if (noteDB != null) {
            noteDB.setTitle(note.getTitle());
            noteDB.setContent(note.getContent());
            return noteRepository.save(noteDB);
        }

        return null;
    }

    @Override
    public void deleteNote(long noteId) {
        noteRepository.deleteById(noteId);
    }
}
