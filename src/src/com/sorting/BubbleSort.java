package com.sorting;

import java.util.Arrays;

//space-O(1)//since no new array is used
//worst time-O(n^2)
//best time-O(n)
public class BubbleSort {
//also known as sinking sort / exchange sort
    public static void main(String[] args) {
        int[] arr={1,3,4,2,5};
        int[] result=bubbleSort(arr);
        System.out.println("Result:"+Arrays.toString(result));
        
    }

    static int[] bubbleSort(int[] arr){
        boolean swapped;
        // while(p1<p2){
            for (int i=0; i<=arr.length-1;i++){
                swapped=false;
                //i==>pass
                //j==>index
                for (int j=1; j<=arr.length-i-1;j++){

                    if(arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        swapped=true;
                    }
                }

                if(!swapped){
                    break;
                }
            }


            return arr;
        // }

    }
    
}
