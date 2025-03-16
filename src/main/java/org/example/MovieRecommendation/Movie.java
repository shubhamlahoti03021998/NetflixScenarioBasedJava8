package org.example.MovieRecommendation;

import java.util.List;

public class Movie {

    private String title;
    private Double rating; // Can be null
    private List<String> genres;
    private List<String> actors;
    private int releaseYear;

    public Movie() {
    }

    public Movie(String title, Double rating, List<String> genres, List<String> actors, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.genres = genres;
        this.actors = actors;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public Double getRating() {
        return rating;
    }

    public List<String> getGenres() {
        return genres;
    }

    public List<String> getActors() {
        return actors;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return title + " (" + releaseYear + ") - Rating: " + (rating != null ? rating : "N/A");
    }

    // Getters & toString() method
}
