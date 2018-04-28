package com.sake.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "table_chooses")
public class TableChoose {

    @EmbeddedId
    private TableChooseId id;

    private String note;

    public TableChoose() {
    }

    public TableChooseId getId() {
        return id;
    }

    public void setId(TableChooseId id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
