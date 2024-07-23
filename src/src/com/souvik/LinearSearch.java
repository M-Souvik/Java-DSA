package com.souvik;

import java.util.Scanner;

public class LinearSearch {
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

        int position=LinSearch(arr,num);
        if (position != -1) {
            System.out.println("Found on index "+position);
        }else {
            System.out.println("NotFound");
        }
    }

    static int LinSearch(int[] array, int target) {
        if(array.length==0){
            return -1;
        }

            for (int j = 0; j < array.length; j++) {
                if (array[j] == target) {
                    return j;
                }
            }

        return -1;
    }
}

