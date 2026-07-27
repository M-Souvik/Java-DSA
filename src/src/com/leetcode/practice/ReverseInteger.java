package com.leetcode.practice;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -123;

        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        double ul = -Math.pow(2, 31);
        double ll = Math.pow(2, 31) - 1;
        System.out.println(ul + " " + ll);
        if (x < ul && x > ll)
            return 0;
        int sum = 0;
        int rem = 0;
        int a = x;

        while (a != 0) {
            rem = a % 10;
            sum = sum * 10 + rem;
            a = a / 10;
        }

        return sum;
    }

}
