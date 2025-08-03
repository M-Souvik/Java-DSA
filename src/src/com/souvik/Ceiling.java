package com.souvik;
// smallest element in the array which is greater than or equal to the target
// using binary search
public class Ceiling {
    public static void main(String[] args) {
            int[] arr={12, 13, 14, 16, 18};
            int target=1;
            int result=floor(arr,target);
            System.out.println("The no. exists in index "+result+" and the value is "+arr[result]);

    }

     static int ceiling(int[] arr,int n) {
        if(n>arr[arr.length-1]){
            return -1;
        }
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
        return start;
    }

    static int floor(int[] arr,int n){

        int start=0;
        int end= arr.length-1;
        // largest element in the array which is less than or equal to the target
        // using binary search
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
        return end;
    }
}
