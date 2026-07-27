package com.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode448 {
     public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println("Result:"+cyclic(arr));
        
    }

    static List<Integer> cyclic(int[] arr){
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
        List<Integer> missing=new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){

                missing.add(j+1);
            }
        }

        return missing;


    }

      static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
