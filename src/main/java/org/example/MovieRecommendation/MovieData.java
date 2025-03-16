package org.example.MovieRecommendation;

import java.util.Arrays;
import java.util.List;

public class MovieData {

    public static List<Movie> getMovies() {
        return Arrays.asList(
                new Movie("Inception", 8.8, Arrays.asList("Sci-Fi", "Thriller"), Arrays.asList("Leonardo DiCaprio", "Tom Hardy"), 2010),
                new Movie("The Dark Knight", 9.0, Arrays.asList("Action", "Crime"), Arrays.asList("Christian Bale", "Heath Ledger"), 2008),
                new Movie("Interstellar", 8.6, Arrays.asList("Sci-Fi", "Drama"), Arrays.asList("Matthew McConaughey", "Anne Hathaway"), 2014),
                new Movie("Titanic", 7.8, Arrays.asList("Romance", "Drama"), Arrays.asList("Leonardo DiCaprio", "Kate Winslet"), 1997),
                new Movie("The Matrix", 8.7, Arrays.asList("Sci-Fi", "Action"), Arrays.asList("Keanu Reeves", "Laurence Fishburne"), 1999),
                new Movie("Joker", 8.5, Arrays.asList("Drama", "Crime"), Arrays.asList("Joaquin Phoenix", "Robert De Niro"), 2019),
                new Movie("The Prestige", 8.5, Arrays.asList("Drama", "Mystery"), Arrays.asList("Christian Bale", "Hugh Jackman"), 2006),
                new Movie("Avatar", 7.9, Arrays.asList("Sci-Fi", "Adventure"), Arrays.asList("Sam Worthington", "Zoe Saldana"), 2009),
                new Movie("Pulp Fiction", 8.9, Arrays.asList("Crime", "Drama"), Arrays.asList("John Travolta", "Samuel L. Jackson"), 1994),
                new Movie("The Godfather", 9.2, Arrays.asList("Crime", "Drama"), Arrays.asList("Marlon Brando", "Al Pacino"), 1972),
                new Movie("Fight Club", 8.8, Arrays.asList("Drama", "Thriller"), Arrays.asList("Brad Pitt", "Edward Norton"), 1999),
                new Movie("The Shawshank Redemption", 9.3, Arrays.asList("Drama"), Arrays.asList("Tim Robbins", "Morgan Freeman"), 1994),
                new Movie("The Avengers", 8.0, Arrays.asList("Action", "Superhero"), Arrays.asList("Robert Downey Jr.", "Chris Evans"), 2012),
                new Movie("Iron Man", 7.9, Arrays.asList("Action", "Superhero"), Arrays.asList("Robert Downey Jr.", "Gwyneth Paltrow"), 2008),
                new Movie("Deadpool", 8.0, Arrays.asList("Action", "Comedy"), Arrays.asList("Ryan Reynolds", "Morena Baccarin"), 2016),
                new Movie("Spider-Man: No Way Home", 8.7, Arrays.asList("Action", "Superhero"), Arrays.asList("Tom Holland", "Zendaya"), 2021),
                new Movie("Batman Begins", 8.2, Arrays.asList("Action", "Crime"), Arrays.asList("Christian Bale", "Liam Neeson"), 2005),
                new Movie("Gladiator", 8.5, Arrays.asList("Action", "Drama"), Arrays.asList("Russell Crowe", "Joaquin Phoenix"), 2000),
                new Movie("The Departed", 8.5, Arrays.asList("Crime", "Thriller"), Arrays.asList("Leonardo DiCaprio", "Matt Damon"), 2006),
                new Movie("Schindler's List", 9.0, Arrays.asList("Drama", "History"), Arrays.asList("Liam Neeson", "Ralph Fiennes"), 1993),
                new Movie("Parasite", 8.6, Arrays.asList("Drama", "Thriller"), Arrays.asList("Song Kang-ho", "Choi Woo-shik"), 2019),
                new Movie("The Social Network", 7.7, Arrays.asList("Drama", "Biography"), Arrays.asList("Jesse Eisenberg", "Andrew Garfield"), 2010),
                new Movie("1917", null, Arrays.asList("Drama", "War"), Arrays.asList("George MacKay", "Dean-Charles Chapman"), 2019), // No rating
                new Movie("Whiplash", 8.5, Arrays.asList("Drama", "Music"), Arrays.asList("Miles Teller", "J.K. Simmons"), 2014)
        );
    }
}
