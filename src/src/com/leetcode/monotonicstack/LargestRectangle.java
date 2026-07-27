package com.leetcode.monotonicstack;

class LargestRectangle {
    static int getMaxArea(int[] arr) {
        int res = 0, n = arr.length;

        for (int i = 0; i < n; i++) {
            int curr = arr[i];

            // Traverse left while we have a greater height bar
            for (int j = i - 1; j >= 0 && arr[j] >= arr[i]; j--)
                curr += arr[i];

            // Traverse right while we have a greater height bar
            for (int j = i + 1; j < n && arr[j] >= arr[i]; j++)
                curr += arr[i];

            res = Math.max(res, curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 60, 20, 50, 40, 10, 50, 60 };
        System.out.println(getMaxArea(arr));
    }
}