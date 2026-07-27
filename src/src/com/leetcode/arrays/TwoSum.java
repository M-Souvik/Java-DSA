package com.leetcode.arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };

        System.out.println(twoSum(nums, 9));
    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];
        while (left <= right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                result[0] = left;
                result[1] = right;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            } 
        }

        return result;
    }
}
