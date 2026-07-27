package com.leetcode.monotonicstack;

import java.util.Arrays;
import java.util.Stack;

public class FinalPrices {
    public static void main(String[] args) {
        int[] prices = { 8, 4, 6, 2, 3 };
        System.out.println("prices:" + Arrays.toString(finalPrices2(prices)));
    }

    // brute-force Time->O(n^2) Space->O(1)

    public static int[] finalPrices(int[] prices) {
        int[] discountPrice = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            discountPrice[i] = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    discountPrice[i] = prices[i] - prices[j];
                    break;
                }
            }

        }

        return discountPrice;
    }

    // monotonic-stack approach

    public static int[] finalPrices2(int[] prices) {
        int start = prices.length - 1;

        int[] discountPrice = new int[prices.length];
        Stack<Integer> stack = new Stack<Integer>();
        // while (start > 0) {
        for (int i = start; i >= 0; i--) {
            while (!stack.isEmpty() && prices[i] < stack.peek()) {
                // if (prices[i] > stack.peek()) {
                stack.pop();
                // }
            }
            int discount = 0;
            if (!stack.isEmpty()) {

                discount = stack.peek();
            }

            discountPrice[i] = prices[i] - discount;
            stack.push(prices[i]);

        }
        // }

        System.out.println(stack);
        return discountPrice;

    }
}
