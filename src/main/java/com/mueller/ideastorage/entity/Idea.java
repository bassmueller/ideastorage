package com.mueller.ideastorage.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="idea")
public class Idea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="headline")
    private String headline;

    @Column(name="description")
    private String description;

    @Column(name="tags")
    private String tags;

    public Idea(int id, String headline, String description, String tags) {
        this.id = id;
        this.headline = headline;
        this.description = description;
        this.tags = tags;
    }

    public Idea() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Idea idea = (Idea) o;
        return id == idea.id &&
                Objects.equals(headline, idea.headline) &&
                Objects.equals(description, idea.description) &&
                Objects.equals(tags, idea.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, headline, description, tags);
    }

    @Override
    public String toString() {
        return "Idea{" +
                "id=" + id +
                ", headline='" + headline + '\'' +
                ", description='" + description + '\'' +
                ", tags='" + tags + '\'' +
                '}';
    }
}
