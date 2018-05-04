package com.sake.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "confections")
public class Confection {

    @EmbeddedId
    private ConfectionId id;

    private String note;

    public Confection() {
    }

    public ConfectionId getId() {
        return id;
    }

    public void setId(ConfectionId id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


}
