package org.example;

import static org.example.ClosestToZero.findClosestToZero;

public class Main {
    public static void main(String[] args) {
        int[] nums = {10, -2, 2, 3, -4};  // Example input
        System.out.println("Number closest to zero is: " + findClosestToZero(nums));

    }
}