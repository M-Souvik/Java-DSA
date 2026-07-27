package com.leetcode.arrays;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = { -5, 8, -14, 2, 4, 12 };
        int k = -5;
        System.out.println(longestSubarrayWithSumK(arr, k));
    }

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        int left = 0;
        int right = 0;
        int n = arr.length;
        int sum = arr[0];
        int maxLength = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                int length = right - left + 1;
                maxLength = Math.max(maxLength, length);
            }
            right++;
            if (right < n)
                sum += arr[right];

        }

        return maxLength;

    }
}
