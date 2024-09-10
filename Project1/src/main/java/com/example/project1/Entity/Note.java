package com.example.project1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;

@Setter
@Getter
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noteId;

    private String title;
    private String content;
    private Date dateAdded;
    private Date dateModified;

    public Note(Long noteId, String title, String content, Date dateAdded, Date dateModified) {
        this.noteId = noteId;
        this.title = title;
        this.content = content;
        this.dateAdded = dateAdded;
        this.dateModified = dateModified;
    }

    public Note() {
    }

}
