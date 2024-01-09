package org.example;

public class ClosestToZero {
    public static int findClosestToZero(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int current = nums[0];

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(current) || (Math.abs(num) == Math.abs(current) && num > current)) {
                current = num;
            }
        }
        return current;
    }
}