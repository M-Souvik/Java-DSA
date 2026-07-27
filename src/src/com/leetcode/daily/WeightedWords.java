package com.leetcode.daily;

//leetcode 3838
public class WeightedWords {
    public static void main(String[] args) {
        String[] words = { "abcd", "def", "xyz" };
        int[] weights = { 5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2 };
        String res = mapWordWeights(words, weights);
        System.out.println(res);
    }

    public static String mapWordWeights(String[] words, int[] weights) {
        String res = "";
        for (int i = 0; i < words.length; i++) {
            int totalWeight = 0;
            int n = words[i].length();
            for (int j = 0; j < n; j++) {
                int value = words[i].charAt(j) - 'a';
                totalWeight += weights[value];
            }
            res = res + (char) ('z' - totalWeight % 26);
        }

        return res;

    }
}
