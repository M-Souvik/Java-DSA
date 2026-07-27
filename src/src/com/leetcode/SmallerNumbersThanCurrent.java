package com.leetcode;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {

    public static void main(String[] args) {

        int[] arr = { 8, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            int counter = 0;
            for (int j = 0; j < result.length; j++) {
                if (nums[i] > nums[j]) {
                    counter++;

                }

            }
            result[i] = counter;
        }

        return result;
    }

}
