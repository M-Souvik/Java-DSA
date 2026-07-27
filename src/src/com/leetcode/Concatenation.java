package com.leetcode;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {

        int[] nums = { 1, 2, 1 };
        System.out.println(Arrays.toString(getConcatenation2(nums)));

    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i <= ans.length - 1; i++) {
            ans[i] = nums[i % nums.length];
        }
        return ans;
    }

    static int[] getConcatenation2(int[] nums) {
        int n = nums.length;
        int[] ans = Arrays.copyOf(nums, n * 2);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }
}
