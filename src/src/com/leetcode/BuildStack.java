package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BuildStack {
    public static void main(String[] args) {

        int[] target = { 1, 2 };
        int n = 4;

        System.out.println("Output:" + buildArray(target, n));

    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> s = new ArrayList<String>();
        int tIdx = 0;
        for (int num = 1; num <= n && tIdx < target.length; num++) {
            s.add("Push");
            if (target[tIdx] == num) {
                tIdx++;
            } else {
                s.add("Pop");
            }
        }

        return s;
    }

}
