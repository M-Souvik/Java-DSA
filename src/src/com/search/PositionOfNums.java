package com.search;

public class PositionOfNums {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,5,5,7,8,9,10};
        int target=5;
        System.out.println("Occurrence of "+target+" is at index: "+searchRange(arr,target));
        // System.out.println("Last Occurrence of "+target+" is at index: "+searchRange(arr,target));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        int start=position(nums, target, true);
        int end=position(nums, target, false);
        arr[0]=start;
        if(arr[0]!= -1){
            arr[1]=end;
        }
        // arr[1]=end;
        return arr;
        
    }

    
    static int position(int[] arr, int target, boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
               ans=mid;
               if(findStartIndex){
                end=mid-1;
               } else{
                start=mid+1;
               }
            }
        }
        return ans;
    }
}
