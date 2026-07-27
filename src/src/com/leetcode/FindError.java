package com.leetcode;

import java.util.Arrays;

public class FindError {

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2 };
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2];

        int i = 0;
        while (i < n) {
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                if (correctIndex >= 0 && correctIndex < n && nums[correctIndex] != nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[correctIndex];
                    nums[correctIndex] = temp;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }

        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                result[0] = nums[i]; // duplicate
                result[1] = i + 1; // missing
                break;
            }
        }

        return result;
    }

}
