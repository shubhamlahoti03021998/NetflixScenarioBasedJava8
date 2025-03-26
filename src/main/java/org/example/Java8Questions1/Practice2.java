package org.example.Java8Questions1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice2 {

    public static void main(String[] args) {
        List<String> words = List.of("cat", "dog", "banana", "elephant", "fox", "kiwi", "apple");

        /* Given a list of words, group them by their length into a Map<Integer, List<String>>, then use flatMap to generate a flattened list of words in the format "word(length)". */
        WordsByLengthAndFlatten(words);

        /*
        Modify the problem to count the number of words for each length instead of listing them, then flatten into a list of strings in the format:
         */
        System.out.println(CountWordsByLengthAndFlatten(words));

        //Instead of random order, sort the words by length before flattening.
        SortWordsByLengthAndFlatten(words);

        //Instead of grouping all words, keep only one word per unique length and flatten.
        KeepOnlyUniqueLengthsAndFlatten(words);
    }

    private static void KeepOnlyUniqueLengthsAndFlatten(List<String> words) {
        Map<Integer,List<String>> collect1 =words.stream().collect(Collectors.groupingBy(String::length));
       List<String> collect2 = collect1.entrySet().stream().flatMap(st->st.getValue().stream().limit(1).map(word->word + "("+ st.getKey() + ")")).collect(Collectors.toList());
        System.out.println(collect2);
    }

    private static void SortWordsByLengthAndFlatten(List<String> words) {
        Map<Integer,List<String>> collect = words.stream().collect(Collectors.groupingBy(String::length));
        var stringStream = collect.entrySet().stream().sorted(Map.Entry.comparingByKey()).flatMap(st -> st.getValue().stream().map(word -> word + "(" + st.getKey() + ")")).collect(Collectors.toList());
        System.out.println(stringStream);
    }

    private static List<String> CountWordsByLengthAndFlatten(List<String> words) {
        List<String> lt = new ArrayList<>();
        var collect = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
        for (Map.Entry<Integer, List<String>> en : collect.entrySet()) {
            var key = en.getKey();
            var count = en.getValue().stream().count();
            lt.add("Length " + key + ":" + count + " words");
        }

        return lt;
    }


    private static void WordsByLengthAndFlatten(List<String> words) {
        var collect = words.stream().collect(Collectors.groupingBy(String::length));
        var collect1 = collect.entrySet().stream().flatMap(e -> e.getValue().stream().map(word -> word + "(" + e.getKey() + ")")).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
