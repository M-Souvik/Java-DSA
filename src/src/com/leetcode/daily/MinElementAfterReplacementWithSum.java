package com.leetcode.daily;

public class MinElementAfterReplacementWithSum {
    public static void main(String[] args) {
        int[] nums = { 10, 12, 13, 14 };
        System.out.println(minElement(nums));
    }

    public static int minElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int min = Integer.MAX_VALUE;
        for (int val : nums) {
            int x = Math.abs(val);
            int sum = 0;
            if (x == 0)
                sum = 0;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            if (sum < min)
                min = sum;
        }

        return min;
    }
}
