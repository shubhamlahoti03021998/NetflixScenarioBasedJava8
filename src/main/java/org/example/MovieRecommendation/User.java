package org.example.MovieRecommendation;

import java.util.List;

public class User {

    private String name;
    private List<Movie> watchHistory;

    public User(String name, List<Movie> watchHistory) {
        this.name = name;
        this.watchHistory = watchHistory;
    }

    public String getName() { return name; }
    public List<Movie> getWatchHistory() { return watchHistory; }

    @Override
    public String toString() {
        return name;
    }
}
