package com.souvik;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr2D={
                {2,3,4,5},
                {8,9,0},
                {10,11,12,14}
        };


        int minimum=Min(arr2D);
        System.out.println("Minimum-No:"+minimum);
        System.out.println("Element found on "+Arrays.toString(search2D(arr2D,minimum)));
        int maximum=Max(arr2D);
        System.out.println("Maximum-No:"+maximum);
        System.out.println("Element found on "+Arrays.toString(search2D(arr2D,maximum)));
    }

    private static int Max(int[][] arr2D) {
        int max =arr2D[0][0];
        for (int[] ints : arr2D) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    static int Min(int[][] arr2D) {
        int min=arr2D[0][0];
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                if (min>arr2D[row][col]) {
                    min=arr2D[row][col];
                }
            }
        }
        return min;
    }

    static int[] search2D(int[][] arr2D, int num) {
         if (arr2D.length == 0) {
             return new int[]{-1,-1};
         }

         for (int row = 0; row < arr2D.length; row++) {
             for (int col = 0; col < arr2D[row].length; col++) {
                 if (arr2D[row][col] == num) {
                     return new int[]{row+1,col+1};
                 }
             }
         }
         return new int[]{-1,-1};
     }
}
