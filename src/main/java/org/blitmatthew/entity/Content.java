package org.blitmatthew.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a streamable content item (movie, show, etc.)
 * Students will expand this class throughout the week
 */
public class Content {
    private String id;
    private String title;
    private String genre;
    private int releaseYear;
    private double rating;
    private List<String> tags;
    private boolean isPremium;

    public Content(String id, String title, String genre, int releaseYear) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = 0.0;
        this.tags = new ArrayList<>();
        this.isPremium = false;
    }

    // Getters and setters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getReleaseYear() { return releaseYear; }
    public double getRating() { return rating; }
    public List<String> getTags() { return tags; }
    public boolean isPremium() { return isPremium; }

    public void setRating(double rating) { this.rating = rating; }
    public void setPremium(boolean premium) { isPremium = premium; }

    // TODO Day 1: Implement addTag method using Optional to prevent null tags
    public void addTag(String tag) {
        tags.add(tag);
    }
}
