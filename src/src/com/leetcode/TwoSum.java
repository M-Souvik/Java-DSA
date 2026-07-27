package com.leetcode;
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 7;
        int[] result=twoSum(nums, target);
        System.out.println("Result: "+ Arrays.toString(result) );
    }

    public static int[] twoSum(int[] nums, int target) {
        int pivot=0;
        int sum=0;
        int i=0;
       
        while(i<nums.length){
            sum=nums[pivot]+nums[i];
            if(sum==target && pivot!=i){
                
                return new int[] {pivot, i};
            }else{
                if(i==nums.length-1){
                    pivot++;
                    i=pivot;
                }
                i++;
            }
        }
        return new int[] {-1, -1};
    }
}
