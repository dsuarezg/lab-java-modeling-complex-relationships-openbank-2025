package com.ironhack.complex_relationship.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

@Entity
public class Conference extends Event{

    @OneToMany
    private List<Speaker> speakerList;

    public Conference() {
    }

    public Conference(Date date, String location, String title, List<Guest> guests, List<Speaker> speakerList) {
        super(date, location, title, guests);
        setSpeakerList(speakerList);
    }

    public List<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }
}
