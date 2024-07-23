package com.souvik;

import java.util.Scanner;

public class FindingMinMax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        int minimum;
        int maximum;

        for(int i = 0; i< arr.length; i++){
            System.out.print("Enter the element "+(i+1)+":");
            arr[i]=in.nextInt();
        }

        minimum =FindMin(arr);
        System.out.println("The-minimum-no-is:"+ minimum);
        maximum =FindMax(arr);
        System.out.println("The-maximum-no-is:"+ maximum);
    }

    static int FindMin(int[] array) {
        int min=array[0];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }
    static int FindMax(int[] array) {
        int max =array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }

        }
        return max;
    }
}
