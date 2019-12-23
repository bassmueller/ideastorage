package com.mueller.ideastorage.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Document( collection = "ideas")
public class Idea {
    @Id
    private String id;
    private String headline;
    private String description;
    private List<String> tags;
    private double score;

    public Idea(String headline, String description, List<String> tags, double score) {
        this.headline = headline;
        this.description = description;
        this.tags = tags;
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }


    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Idea idea = (Idea) o;
        return id.equals(idea.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
