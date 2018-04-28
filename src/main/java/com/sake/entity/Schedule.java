package com.sake.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "schedules")
public class Schedule {

    @EmbeddedId
    private ScheduleId id;

    private String note;

    public Schedule() {
    }

    public Schedule(ScheduleId id, String note) {
        this.id = id;
        this.note = note;
    }

    public ScheduleId getId() {
        return id;
    }

    public void setId(ScheduleId id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
