package com.leetcode.daily;

public class NumOfStrings {
    public static void main(String[] args) {
        String[] patterns = { "a", "a", "a" };
        String word = "ab";
        System.out.println(numOfStrings(patterns, word));
    }

    public static int numOfStrings(String[] patterns, String word) {
        int counter = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                counter++;
            }
            continue;
        }
        return counter;
    }
}
