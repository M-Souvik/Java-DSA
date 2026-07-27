package com.leetcode.daily;

import java.util.Arrays;

public class MaxIcecream {
    public static void main(String[] args) {
        int[] costs = { 1, 6, 3, 1, 2, 5 };
        int coins = 20;
        System.out.println(maxIceCream(costs, coins));
    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        int cost = 0;
        for (int i = 0; i < costs.length; i++) {

            cost = cost + costs[i];
            if (cost <= coins) {
                count++;
                // continue;
            } else {
                break;
            }

        }

        return count;

    }

}
