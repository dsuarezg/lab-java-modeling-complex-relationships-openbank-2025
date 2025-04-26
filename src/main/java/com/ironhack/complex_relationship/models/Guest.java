package com.ironhack.complex_relationship.models;

import jakarta.persistence.Entity;

@Entity
public class Guest extends Person {

    private GuestStatus status;

    public Guest() {
    }

    public Guest(GuestStatus status) {
        setStatus(status);
    }

    public GuestStatus getStatus() {
        return status;
    }

    public void setStatus(GuestStatus status) {
        this.status = status;
    }
}
