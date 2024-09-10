package com.example.project1.Controller;

import com.example.Entity.Note;


@RestController
@RequestMapping("/api/v1/notes")
public class NoteController {

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public List<Note> getNotes() {
        return noteService.getAllNotes();
    }

    @GetMapping("/{noteId}")
    public Note getNoteById(@PathVariable("noteId") long noteId) {
        return userService.getNoteById(noteId);
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