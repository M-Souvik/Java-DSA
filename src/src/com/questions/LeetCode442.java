package com.questions;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;
import java.util.List;

public class LeetCode442 {
     public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        int[] sorted=cyclic(arr);

        List<Integer> mismatchedIndex=checkIndexNos(sorted);
        System.out.println("Result:"+Arrays.toString(sorted));
        System.out.println("Result:"+mismatchedIndex);
        
    }

    static int[] cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex] ){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
            
        }
        return arr;


    }

    static List<Integer> checkIndexNos(int[] arr){
        List<Integer> result=new ArrayList<>();
        // int i=0;
        // int mismatchIndex;
       for (int j = 0; j < arr.length; j++) {
        if(arr[j]!=j+1){
            // j++;
            result.add(arr[j]);
        }
       }
        return result;
    }

    

    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
