package com.example.project1.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.Entity.Note;
import com.example.project1.Service.NoteService;


@RestController
@RequestMapping("/api/v1/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public List<Note> getNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("/{noteId}")
    public Note getNoteById(@PathVariable("noteId") long noteId) {
        return noteService.getNoteById(noteId);
    }

    @PostMapping("/")
    public Note addNote(@RequestBody Note note) {
        return noteService.addNote(note);
    }

    @PutMapping("/{noteId}")
    public Note updateNote(@PathVariable("noteId") Long noteId, @RequestBody Note note) {
        return noteService.updateNote(noteId, note);
    }

    @DeleteMapping("/{noteId}")
    public String deleteNote(@PathVariable("noteId") Long noteId) {
        noteService.deleteNote(noteId);
        return "Note Deleted Successfully";
    }
}