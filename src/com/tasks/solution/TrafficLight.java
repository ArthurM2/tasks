package com.tasks.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        double d = Double.parseDouble(s);

        if (d >= 0 && d < 2) {
            System.out.println("green ");
        } else if (d >= 2 && d < 5) {
            System.out.println("yellow");
        } else {
            System.out.println("red");
        }
    }
}
