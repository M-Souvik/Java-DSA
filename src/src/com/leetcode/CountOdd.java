package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class CountOdd {
    public static void main(String[] args) {
        System.err.println("odd nos"+countOdds(0, 1000000000));
    }

    static int countOdds(int low, int high) {
        int count=high-low+1;  
       if(count%2==0){
            return count/2;
       }
        
        return (count+1)/2;
    }
}
