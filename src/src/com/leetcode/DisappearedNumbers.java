package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(nums));

    }

    static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                // System.out.println(nums[index]);
                nums[index] = -nums[index];
            }

        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;

    }

}
