package org.example.MovieRecommendation;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Answers {

    public static void main(String[] args) {
        List<Movie> movie = new ArrayList<>();
        //Scenario 1: Filtering Top-Rated Movies (Using Java 8 Streams, filter out the top 5 movies that have a rating above 8.0, sorted by rating in descending order.)
        System.out.println(TopRatedMovies(movie));

        //Scenario 2: Finding Most Popular Genre
        MostPopularGenre(movie);

    }

    private static List<String> MostPopularGenre(List<Movie> movie) {
     //   movie.stream().map(i->i.getGenres()).collect(Collectors.groupingBy(Function.identity())).entrySet().stream()
    //    var collect = movie.stream().collect(Collectors.mapping(i -> i.getGenres(), Collectors.groupingBy(Function.identity()))).entrySet().stream().sorted))
     return null;
    }

    private static List<Movie> TopRatedMovies(List<Movie> movie) {
        var collect = movie.stream().filter(i -> i.getRating() > 8.0).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        return collect;
    }
}
