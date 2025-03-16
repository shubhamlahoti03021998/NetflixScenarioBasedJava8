package org.example.MovieRecommendation;

import java.util.Arrays;
import java.util.List;

public class UserData {


    public static List<User> getUsers() {
        List<Movie> movies = MovieData.getMovies();

        return Arrays.asList(
                new User("Alice", Arrays.asList(movies.get(0), movies.get(2), movies.get(5))), // Inception, Interstellar, Joker
                new User("Bob", Arrays.asList(movies.get(1), movies.get(3), movies.get(4))),   // Dark Knight, Titanic, Matrix
                new User("Charlie", Arrays.asList(movies.get(6), movies.get(8), movies.get(10))), // Prestige, Pulp Fiction, Fight Club
                new User("David", Arrays.asList(movies.get(11), movies.get(12), movies.get(14))), // Shawshank, Avengers, Deadpool
                new User("Eve", Arrays.asList(movies.get(7), movies.get(9), movies.get(13)))  // Avatar, Godfather, Iron Man
        );
    }
}
