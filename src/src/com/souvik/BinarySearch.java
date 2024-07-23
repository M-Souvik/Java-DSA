package com.souvik;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
            int[] arr={5,3,2,4,1};
            int target=2;
//            SortArray(arr);
//            System.out.println(Arrays.toString(arr));
            int result=search(arr,target);
            System.out.println("The no. exists in index "+result);

    }

    static int search(int[] arr,int n) {
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(n==arr[mid]){
                return mid;
            } else if (n<arr[mid]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
//    static void SortArray(int[] arr){
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 1; j < arr.length; j++) {
//                if (arr[i]>=arr[j]){
//                    int temp;
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }

//    }
}

