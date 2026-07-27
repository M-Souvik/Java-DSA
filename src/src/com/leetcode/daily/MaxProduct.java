package com.leetcode.daily;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] nums = { -100, -2, -3, 1 };
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        // int j=
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int product = nums[i] * nums[j] * nums[k];
                max = Integer.max(max, product);
                if (product < 0) {
                    k--;
                } else if (product >= 0) {
                    j++;
                }
            }
        }

        return max;

    }

    public static int maximumProduct2(int[] nums) {
        Arrays.sort(nums);
        System.gc();
        int n = nums.length;
        int a = nums[1] * nums[0] * nums[n - 1];
        int b = nums[n - 2] * nums[n - 1] * nums[n - 3];
        return Math.max(a, b);
    }
}
