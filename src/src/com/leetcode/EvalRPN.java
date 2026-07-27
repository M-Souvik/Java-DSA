package com.leetcode;

import java.util.ArrayList;
import java.util.List;

class EvalRPN {
    public static void main(String[] args) {
        String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };

        System.out.println(evalRPN(tokens));

    }

    public static int evalRPN(String[] tokens) {

        List<Integer> numStack = new ArrayList<Integer>();

        for (String string : tokens) {
            if (checkNumber(string)) {
                numStack.add(Integer.parseInt(string));
            } else if (checkOperand(string)) {
                int start = numStack.size() - 2;
                int end = numStack.size() - 1;

                int res = calculate(numStack.get(start), numStack.get(end), string);
                numStack.remove(end);
                numStack.remove(start);
                numStack.add(res);

            }
        }

        return numStack.get(0);
    }

    public static boolean checkNumber(String token) {
        if (token == null)
            return false;
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean checkOperand(String token) {
        return token != null && token.matches("[+\\-*/]");
    }

    public static int calculate(int a, int b, String op) {
        System.out.println("a:" + a + "op:" + op + "b:" + b);
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }

    }
}