package com.sake.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "prices")
public class Price {

    @EmbeddedId
    private PriceId id;

    public Price() {
    }

    public PriceId getId() {
        return id;
    }

    public void setId(PriceId id) {
        this.id = id;
    }

}
