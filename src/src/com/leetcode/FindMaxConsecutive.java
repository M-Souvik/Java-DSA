package com.leetcode;

public class FindMaxConsecutive {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    static int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int counter = 0;
        int ans = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                System.out.println("caught a 0, resetting to 0");
                counter = 0;
            } else {
                counter++;

            }
            ans = max(ans, counter);
            i++;
        }
        return ans;

    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;

    }
}
