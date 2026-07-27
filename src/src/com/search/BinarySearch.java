package com.search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
            int[] arr={5,3,2,4,1};
            int target=2;
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
}

