package com.leetcode.arrays;

import java.util.Arrays;

//available on gfg
public class Sort012 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2 };
        optimalSort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    // better solution
    public static void sort012(int[] arr) {
        // code here
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i : arr) {
            if (i == 0)
                count0++;
            else if (i == 1)
                count1++;
            else if (i == 2)
                count2++;

        }

        // System.out.println("Counts:" + count0 + ", " + count1 + ", " + count2);

        for (int i = 0; i < count0; i++) {
            // System.out.println("print 0");
            arr[i] = 0;
        }

        for (int j = count0; j < count0 + count1; j++) {
            // System.out.println("print 1");
            arr[j] = 1;

        }

        for (int k = count0 + count1; k < arr.length; k++) {
            // System.out.println("print 2");
            arr[k] = 2;

        }
    }

    // optimal soln (dutch national flag algo)
    public static void optimalSort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                System.out.println("swapping 0");
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                System.out.println("swapping 1");
                mid++;
            } else if (arr[mid] == 2) {
                System.out.println("swapping 2");
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
