package com.sorting;

import java.util.Arrays;

//only works with range (1, N) and continous
public class CyclicSort {
    
    public static void main(String[] args) {
        int[] arr={1, 5, 3, 2, 4};
        System.out.println("Result:"+Arrays.toString(cyclic(arr)));
        
    }

    static int[] cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[correctIndex]!=arr[i]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
        return arr;


    }

    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
