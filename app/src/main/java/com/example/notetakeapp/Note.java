package com.example.notetakeapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {
    private String title;

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String description;
    //@ColumnInfo(name="priority_column_change")
    private int priority;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    public int getId() {
        return id;
    }

    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public void setId(int id) {
        this.id = id;
    }
}
