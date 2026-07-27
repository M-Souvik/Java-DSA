package com.leetcode.monotonicstack;

import java.util.Arrays;
// import java.util.List;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = { 2, 10, 12, 1, 11 };
        int[] nge = nextGreaterElement(arr);
        System.out.println(Arrays.toString(nge));
    }

    public static int[] nextGreaterElement(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = stack.peek();
            }

            stack.push(arr[i]);

        }
        return nge;

    }
}
