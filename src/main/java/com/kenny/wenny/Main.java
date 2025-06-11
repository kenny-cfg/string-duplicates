package com.kenny.wenny;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] source = { "apple", "apple", "pear"};
        var result = removeDuplicatesLoop(source);
        for (var element : result) {
            System.out.println(element);
        }
    }

    public static String[] removeDuplicates(String[] source) {
        return Arrays.stream(source)
                .distinct()
                .toArray(String[]::new);
    }

    public static String[] removeDuplicatesLoop(String[] source) {
        var result = new HashSet<String>(Arrays.stream(source).toList());
        return result.toArray(String[]::new);
    }
}