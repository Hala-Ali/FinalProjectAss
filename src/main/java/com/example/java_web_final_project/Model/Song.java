package com.example.java_web_final_project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jdk.jfr.DataAmount;

import java.util.Objects;
@Entity


public class Song {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String name;
    public Song(){

    }

    public Song(Long id, String title, String name) {
        this.id = id;
        this.title = title;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song song)) return false;
        return Objects.equals(getId(), song.getId()) && Objects.equals(getTitle(), song.getTitle()) && Objects.equals(getName(), song.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getName());
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
