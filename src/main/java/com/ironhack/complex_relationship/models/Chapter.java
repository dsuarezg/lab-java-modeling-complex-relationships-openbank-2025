package com.ironhack.complex_relationship.models;

import jakarta.persistence.*;

import java.util.List;


@Entity(name = "chapter")
public class Chapter {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int chapterId;

    private String district;

    @OneToOne
    private Member president;

    @OneToMany
    private List<Member> members;

    public Chapter() {}

    public Chapter(int chapterId, String district, Member president, List<Member> members) {
        setChapterId(chapterId);
        setDistrict(district);
        setPresident(president);
        setMembers(members);
    }

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
