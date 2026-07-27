package com.leetcode;

import java.util.List;
import java.util.Stack;
import java.util.Arrays;

public class ExclusiveTime {

    public static class Pair {
        int id;
        int start;
        int ct;
    }

    public static void main(String[] args) {

        List<String> logs = Arrays.asList("0:start:0", "0:start:2", "0:end:5", "1:start:6", "1:end:6", "0:end:7");
        int n = 2;

        System.out.println(Arrays.toString(exclusiveTime(n, logs)));
    }

    public static int[] exclusiveTime(int n, List<String> logs) {

        int[] time = new int[n];
        Stack<Pair> stack = new Stack<Pair>();
        for (int i = 0; i < logs.size(); i++) {
            String[] log = logs.get(i).split(":");

            if (log[1].equals("start")) {
                Pair p = new Pair();
                p.id = Integer.parseInt(log[0]);
                p.start = Integer.parseInt(log[2]);
                p.ct = 0;
                stack.push(p);
            } else {
                Pair p = stack.pop();
                int interval = Integer.parseInt(log[2]) - p.start + 1;
                time[p.id] += interval - p.ct;

                if (!stack.isEmpty()) {
                    stack.peek().ct += interval;
                }
            }

        }

        return time;

    }

}
