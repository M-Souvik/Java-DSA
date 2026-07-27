package com.tcsnqt;

import java.util.Arrays;

public class TicketPrice {
    public static void main(String[] args) {
        int[] prices = { 5, 10, 20, 25, 35 };
        System.out.println("Price Summary: " + Arrays.toString(calculatePriceSummary(prices)));
    }

    public static int[] calculatePriceSummary(int[] prices) {
        int sum = 0;
        int i = 0;

        while (i < prices.length) {
            if (prices[i] % 2 != 0) {
                sum += prices[i];
            }
            i++;

        }

        int avg = sum / i;

        // int avg=sum/prices.length;
        return new int[] { sum, avg };
    }

}
