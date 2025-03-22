package org.example.Java8Questions1;

import java.util.*;
import java.util.stream.Collectors;

public class Practice1 {

    public static void main(String[] args) {
        List<List<String>> nestedLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f")
        );

        List<List<Integer>> lt = Arrays.asList(Arrays.asList(13,67,2,4,6,64,76,77),Arrays.asList(3,6,9,4));

        List<List<String>> names = Arrays.asList(Arrays.asList("Charlie", "Alice", "Bob"), Arrays.asList("Shubham","Rizz","Yuz"));

        List<String> sentences = Arrays.asList("Hello world", "Java streams", "FlatMap example");

        // Flatten into a single list
        System.out.println("Flattened list : "+FlattenIntoSingleList(nestedLists));

        System.out.println();
        //Finding and Reducing (Sum of all Even numbers )
        System.out.println("Sum of all Even numbers : "+SumOfAllEvenNumbers(lt));

        System.out.println();
        //Sorting Elements
        SortingElements(names);

        //Transforming and Flattening
        TransformingAndFlattening(sentences);


    }

    private static List<String> TransformingAndFlattening(List<String> sentences) {
        var collect = sentences.stream().flatMap(sen -> Arrays.stream(sen.split(""))).collect(Collectors.toList());
        System.out.println(collect);
        return null;
    }

    private static List<String> SortingElements(List<List<String>> names) {
        List<String> collect = names.stream().flatMap(name->name.stream()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Sorting names in ascending order "+collect);
        return collect;
    }

    private static int SumOfAllEvenNumbers(List<List<Integer>> lt) {
        var collect = lt.stream().flatMap(List::stream).filter(i -> i % 2 == 0).distinct().collect(Collectors.toList());
        System.out.println("Even numbers : " + collect);
        var reduce = collect.stream().reduce(0, Integer::sum);
        return reduce;
    }

    private static List<String> FlattenIntoSingleList(List<List<String>> nestedLists) {
        List<String> collect = nestedLists.stream().flatMap(List::stream).collect(Collectors.toList());
        return collect;
    }
}
