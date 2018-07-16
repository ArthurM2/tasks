package com.tasks.solution;

public class Reverse {
    public static void main(String[] args) {
        String s = "simple example 123 321";
        char[] reverseArray = s.toCharArray();
        for (int i = reverseArray.length - 1; i >= 0; i--) {
            System.out.print(reverseArray[i]);
        }
    }
}
