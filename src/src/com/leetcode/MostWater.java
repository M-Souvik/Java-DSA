package com.leetcode;

public class MostWater {
    public static void main(String[] args) {

        int[] height = { 2, 4 };
        System.err.println("max area:" + maxArea(height));

    }

    static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        while (start <= end) {
            int minNum = min(height[start], height[end]);
            int area = minNum * (end - start);

            if (area > maxArea)
                maxArea = area;
            start++;
        }

        return maxArea;

    }

    static int min(int a, int b) {
        return a > b ? a : b;
    }
}
