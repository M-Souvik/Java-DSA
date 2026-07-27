package com.leetcode.monotonicstack;

import java.util.Arrays;
import java.util.Stack;

class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = { 89, 62, 70, 58, 47, 47, 46, 76, 100, 70 };
        System.out.println(Arrays.toString(dailyTemperatures2(temperatures)));

    }

    // brute-force
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;

        int[] answer = new int[n];

        for (int i = 0; i < temperatures.length; i++) {
            int day = 0;
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    day++;
                    answer[i] = day;
                    break;
                } else {
                    day++;

                }
            }
        }

        return answer;

    }

    // monotonic-stack=> if the elemnet is greater then the prev one pop the prev by
    // updating the count in the result array for the resp index, if not then
    // increase the counter until u get a greater value
    static class Day {
        int temp;
        int index;
    }

    public static int[] dailyTemperatures2(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Day> stack = new Stack<Day>();
        // int daycounter = 0;
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[i] >= stack.peek().temp) {
                stack.pop();

            }

            if (!stack.isEmpty()) {
                answer[i] = stack.peek().index - i;
            }

            Day d = new Day();
            d.index = i;
            d.temp = temperatures[i];
            stack.push(d);

        }

        return answer;

    }
}