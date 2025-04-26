package com.ironhack.complex_relationship.models;

import jakarta.persistence.Entity;

import java.util.Date;
import java.util.List;

@Entity
public class Exposition extends Event{

    public Exposition() {}

    public Exposition(Date date, String location, String title, List<Guest> guests) {
        super( date, location, title, guests);
    }


}
