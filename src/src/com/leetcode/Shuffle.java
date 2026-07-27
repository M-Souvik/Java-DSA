package com.leetcode;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;

        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int i = 0;
        int j = 0;
        int k = n;
        while (i < nums.length) {
            ans[i] = nums[j];
            ans[i + 1] = nums[k];
            j++;
            k++;
            i += 2;

        }

        return ans;
    }
}
