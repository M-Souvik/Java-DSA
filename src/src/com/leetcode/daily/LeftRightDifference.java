package com.leetcode.daily;

import java.util.Arrays;

public class LeftRightDifference {

    public static void main(String[] args) {
        int[] nums = { 1 };
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int _leftSum = 0;
            int _rightSum = 0;
            for (int j = 0; j < i; j++) {
                // if(nums)
                _leftSum = _leftSum + nums[j];
            }
            for (int k = i + 1; k < nums.length; k++) {
                _rightSum = _rightSum + nums[k];
            }
            res[i] = Math.abs(_leftSum - _rightSum);
        }
        return res;
    }
}
