package com.sake.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "areas")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private boolean enable;

    @OneToMany(mappedBy = "area")
    private Set<Table> tables;

    public Area() {
    }

    public Area(String name, boolean enable) {
        this.name = name;
        this.enable = enable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public Set<Table> getTables() {
        return tables;
    }

    public void setTables(Set<Table> tables) {
        this.tables = tables;
    }

}
