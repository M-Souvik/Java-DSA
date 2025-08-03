package com.questions;

public class MissingNumber {
     public static void main(String[] args) {
        int[] arr={4, 0, 2, 1};
        int[] sorted=cyclic(arr);
        int mismatchedIndex=checkIndexNos(sorted);

        System.out.println("Result:"+mismatchedIndex);
        
    }

    static int[] cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i];
            if(arr[i]<arr.length &&  arr[i]!=arr[correctIndex] ){
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
            if(i!=arr[i]){
                return i;
            }
            
        }
        return arr.length;
    }

    

    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
