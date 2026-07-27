package com.leetcode.arrays;

import java.util.Arrays;

public class LargestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for (int i = 0; i < strs.length; i++) {
            // int start=0;
            for (int j = 0; j <= strs[i].length(); j++) {
                int commonCount = 0;
                String string = strs[i].substring(0, j);
                for (int k = 0; k < strs.length; k++) {
                    if (strs[k].startsWith(string)) {
                        commonCount++;
                    }

                }
                // System.out.println(string + " " + commonCount);
                if (commonCount == strs.length) {
                    if (string.length() > prefix.length()) {
                        prefix = string;
                    }
                }
            }

        }
        return prefix;
    }
}
