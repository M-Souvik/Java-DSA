package com.questions;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr={7,8,9,11,12};
        System.out.println(Arrays.toString(cyclic(arr)));
        int result=checkIndexNos(arr);
        System.out.println(result);

    }

    static int[] cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]>0&&arr[i]<=arr.length &&  arr[i]!=arr[correctIndex] ){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
            
        }
        return arr;


    }

    static int checkIndexNos(int[] arr){
        int i=0;
        // int mismatchIndex;
        while (i<arr.length) {
            if(i+1==arr[i]){
                i++;
            }else{
                break;
            }
            
        }
        return i+1;
    }

    

    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
