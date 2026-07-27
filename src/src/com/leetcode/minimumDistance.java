package com.leetcode;

public class minimumDistance {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 2, 3 };
        System.out.println("Minimum Distance:" + minimumDistance(nums));

    }

    public static int minimumDistance(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        int a = start;
        int b;
        int c;
        while (start < end) {
            if (nums[start] == nums[end]) {
                a = start;
                b = end;
                // c=b-a;
                // return c;
            } else if (nums[start] != nums[end]) {
                start++;
            }
        }
        return -1;
    }
}
