package com.souvik;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        int num;

        for(int i = 0; i< arr.length; i++){
            System.out.print("Enter the element "+(i+1)+":");
            arr[i]=in.nextInt();
        }

        System.out.println("Enter the no to be searched:");
        num=in.nextInt();
        System.out.println("Starting-idx:");
        int start=in.nextInt();
        System.out.println("ending-idx:");
        int end=in.nextInt();
        int position=LinSearch(arr,num,start,end);
        if (position != -1) {
            System.out.println("Found on index "+position);
        }else {
            System.out.println("NotFound");
        }
    }

    static int LinSearch(int[] array, int target,int idx1,int idx2) {
        if(array.length==0){
            return -1;
        }

        for (int j = idx1; j <= idx2; j++) {
            if (array[j] == target) {
                return j;
            }
        }

        return -1;
    }

}
