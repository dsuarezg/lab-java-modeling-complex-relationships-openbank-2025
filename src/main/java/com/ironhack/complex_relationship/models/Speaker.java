package com.ironhack.complex_relationship.models;

import jakarta.persistence.Entity;

@Entity
public class Speaker extends Person {

    private Double presentationDuration;

    public Speaker() {}

    public Speaker(int id, String name, Double presentationDuration) {
        super(id, name);
        setPresentationDuration(presentationDuration);
    }

    public Double getPresentationDuration() {
        return presentationDuration;
    }

    public void setPresentationDuration(Double presentationDuration) {
        this.presentationDuration = presentationDuration;
    }
}
