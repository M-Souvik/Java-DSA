package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 0 };

        System.out.println(threeSum2pointer(nums));
    }

    // T(n) -> O(n^2logm) (hashing)
    public static List<List<Integer>> threeSum(int[] nums) {

        // Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> res = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            Set<Integer> set = new LinkedHashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int c = target - nums[j];
                if (set.contains(c)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(c);
                    Collections.sort(temp);
                    res.add(temp);
                }

                set.add(nums[j]);
            }
        }
        ans = new ArrayList<>(res);
        return ans;
    }

    // optimal
    public static List<List<Integer>> threeSum2pointer(int[] nums) {

        List<List<Integer>> triplet = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    Collections.sort(temp);
                    triplet.add(temp);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;

                }
            }
        }

        return triplet;

    }

}
