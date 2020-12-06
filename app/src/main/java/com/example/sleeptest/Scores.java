package com.example.sleeptest;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "score_table")
public class Scores {

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "date_time")
    private String dateTime;
    @ColumnInfo(name = "Total Score")
    private int totalScore;

    public Scores(String dateTime, int totalScore) {
        this.dateTime = dateTime;
        this.totalScore = totalScore;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateTime(String dateTime) { this.dateTime = dateTime; }
    public void setMemoryScore(int totalScore) { this.totalScore = totalScore; }


    public int getId() { return id; }
    public String getDateTime() { return dateTime; }
    public int getMemoryScore() { return totalScore; }
}