package com.souvik;

public class peakIndexInMountainArray {
    //[1,2,10,4,5]
    public static void main(String[] args) {
        int[] arr={0,10,5,2};
        System.out.print(arr[peakIndex(arr)]);
    }

    public static int peakIndex(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //I am in decreasing part of array
                //this may be my answer but i will look at left side
                end=mid;
            }else{
                //I am in increasing part of the array
                start=mid+1;
            }
        }
        //when start==mid the index will be my answer(only one element remaining)
        return start;

        // return -1;
    }
}
