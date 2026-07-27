package com.leetcode.daily;

import java.util.Arrays;

public class MaximumProductOfTwoElement {
    public static void main(String[] args) {
        int[] nums = { 3, 7 };

        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int maxSum = Integer.MIN_VALUE;

        while (i < j && i < nums.length && j > 0) {
            int sum = (nums[i] - 1) * (nums[j] - 1);
            maxSum = Math.max(maxSum, sum);
            if (nums[i] < nums[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxSum;

    }
}