package com.search;

import java.util.Arrays;

public class SearchInSorted2D {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[] result=search(matrix, 4);
        System.out.println("result: " + Arrays.toString(result));
    } 

    static int[] search(int[][] matrix, int target){
        int r=0;
        int c=matrix.length-1;

        while(r < matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r, c};
            }
            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }

        return new int[]{-1, -1};
        // return index;
    }
    
}
