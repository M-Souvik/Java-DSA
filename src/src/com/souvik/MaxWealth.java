package com.souvik;

import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts={
                {1,2},
                {3,4},
        };
        int[] addWealth=addElements(accounts);
        System.out.println(Arrays.toString(addWealth));
        int MaxWealth=Maximum(addWealth);
        System.out.println(MaxWealth);
//        System.out.println(maximumWealth(accounts));
    }

    static int[] addElements(int[][] arr){
        int add=0;
        int[] wealth = new int[2];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                add=add+arr[row][col];
            }
        wealth[row]=add;
            add=0;
        }
        return wealth;
    }
    static int Maximum(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    //Alternative
    static int maximumWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            //checking the answer with overall value
            if (sum > ans) {
                ans = sum;

            }
        }
        return ans;
    }

}
