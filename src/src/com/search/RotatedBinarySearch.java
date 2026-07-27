package com.search;

//[0,1,2,3,4,5,6]
//[3,4,5,6,0,1,2]

public class RotatedBinarySearch {
    public static void main(String[] args) {

        int[] arr={1,3};
        int target=3;

        int result=search(arr, target);

        System.out.println("result: "+result);
        
    }

    // static int RBS(int[] arr, int target, int pivot){
        

    // }

    static int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        int start=0;
        int end=nums.length-1;
        System.out.println(pivot);
        if(pivot==-1){
            return binarySearch(nums, target, start, end);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[start]){
            return binarySearch(nums, target, start, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, end);
    }

    static int binarySearch(int[] arr,int n, int start, int end) {
        while(start<=end){
            int mid = start+(end-start)/2;
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
    

    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
        
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
