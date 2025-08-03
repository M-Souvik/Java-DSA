package com.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr={3,1,4,2,5};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int largestElement(int[] arr, int start, int end){
        int largest=start;
        for (int i=start; i<= end;i++){
            if(arr[largest]<arr[i]){
                largest=i;
            }

        }
        return largest;
    }

    static int[] selectionSort(int[] arr){
        
        for(int i=0; i<arr.length; i++){
            int last=arr.length-i-1;
            //selecting the largest index
            int maxindex=largestElement(arr, 0, last);
            //exchanging the largest with the last element
            int temp=arr[maxindex];
            arr[maxindex]=arr[last];
            arr[last]=temp;
        }

        return arr;
// , last, last)
    }
    
}
