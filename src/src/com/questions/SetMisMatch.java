package com.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        // int[] mismatch= FindMismatch(arr).stream().mapToInt(Integer::intValue).toArray();
        int[] mismatch=FindMismatch(arr);
        System.out.println(Arrays.toString(mismatch));
    }

    static int[] FindMismatch(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[correctIndex]!=arr[i]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
        // return arr;
        // List<Integer> mismatch=new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){

                return new int[] {arr[j], j+1};
            }
        }

        return new int[] {-1,-1};


    }

      static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
