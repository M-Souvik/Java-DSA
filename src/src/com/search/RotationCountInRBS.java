package com.search;

public class RotationCountInRBS {

    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int count;
        if(findPivot(arr)==-1){
        count=0;
        }
        count=findPivot(arr)+1;
        System.out.println("Rotation Count:"+count);

        
    }

   

    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(end>mid&&arr[mid]>arr[mid+1]){
                return mid;

            }
            if(start<mid&&arr[mid]<arr[mid-1]){
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
