package com.souvik;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=3;
        int result=OrderArraySearch(arr,target);
        System.out.println("The no. exists in index "+result);
    }
    static int OrderArraySearch(int[] arr, int n){
        int start=0;
        int end= arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(n==arr[mid]){
                return mid;
            }
            if(isAsc){
                if (n<arr[mid]) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if (n>arr[mid]) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
