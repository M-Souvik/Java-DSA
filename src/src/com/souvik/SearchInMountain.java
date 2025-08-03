package com.souvik;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        int result=search(arr, target);
        System.out.print(result);


        
    }

    static int search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int peak=peakIndex(arr);
        int startIndex=binarySearch(arr, target, start, peak);
        int lastIndex=binarySearch(arr, target, peak+1, end);


        return startIndex<lastIndex?startIndex:lastIndex;

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
                // binarySearch(arr, end, start, end);

            }else{
                //I am in increasing part of the array
                start=mid+1;
                // binarySearch(arr, end, start, end);
            }
        }
        //when start==mid the index will be my answer(only one element remaining)
        return start;

        // return -1;
    }

      static int binarySearch(int[] arr,int n, int start, int end) {
        boolean isAsc=start<end;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(isAsc){
                if (n<arr[mid]) {
                    end=mid-1;
                }else if(n>arr[mid]){
                    start=mid+1;
                }else{
                    return mid;
                }
            }else{
                if (n>arr[mid]) {
                    end=mid-1;
                }else if(n<arr[mid]){
                    start=mid+1;
                }else{
                    return mid;
                }

            }
        }
        return -1;
    }


}
