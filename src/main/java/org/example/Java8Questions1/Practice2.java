package org.example.Java8Questions1;

import java.util.*;
import java.util.stream.Collectors;

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

        //Instead of just formatting as "word(length)", also add how many times the length appears in the original list.
        /*
        Expected Output:
        ["dog(3) - 2 words", "kiwi(4) - 2 words", "apple(5) - 2 words", "banana(6) - 1 word"]
         */
        AppendWordFrequencyToOutput(words);

        UppercaseWordsBeforeFlattening(words);
    }

    private static void UppercaseWordsBeforeFlattening(List<String> words) {
        var collect = words.stream().collect(Collectors.groupingBy(String::length));
        var collect1 = collect.entrySet().stream().flatMap(st -> st.getValue().stream().map(word -> word.toUpperCase() + "(" + st.getKey() + ")")).collect(Collectors.joining(" | "));
        System.out.println(collect1);
    }

    private static void AppendWordFrequencyToOutput(List<String> words) {
        var collect = words.stream().collect(Collectors.groupingBy(String::length));
        var collect1 = collect.entrySet().stream().flatMap(st -> st.getValue().stream().map(w -> w + "(" + st.getKey() + ")" + " - " + st.getValue().stream().count())).collect(Collectors.toList());

        System.out.println(collect1);
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
