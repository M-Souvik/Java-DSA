package com.souvik;

//[7, 2, 5, 10, 8]

public class LargestSumAmongSplitArray {
    public static void main(String[] args) {
        
    }

    public int splitArray(int[] arr, int m){
        int start=0;
        int end=0;

        for (int i = 0; i < arr.length; i++) {
            start=Math.max(start, arr[i]);
            end += arr[i];
        }

        while (start < end) {
            int mid=start+(end-start)/2;
            // end=mid;
            //caluculate the no. of pieces you can divide 
            int sum=0;
            int pieces=1;
            for (int i : arr) {
                if(sum+i>mid){
                    //you cant add any more element in it
                    sum=i;
                    pieces++;

                }else{
                    sum += i;
                }
            }
            
            if(pieces>m){
                start=mid+1;
            }else{
                end=mid;
            }
        }

        return end;
    }
    
}
