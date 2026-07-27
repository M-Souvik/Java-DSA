package com.leetcode.daily;

import java.util.Arrays;

class MaximumElementAfterDecrementingAndRearranging {
    public static void main(String[] args) {
        int[] arr = { 73, 98, 9 };
        System.out.println(maximumElementAfterDecrementingAndRearranging(arr));
    }

    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if ((i - 1) >= 0 && Math.abs(arr[i - 1] - arr[i]) > 1) {
                arr[i] = arr[i - 1] + 1;
            }
            max = Math.max(max, arr[i]);
        }

        return max;
    }
}
