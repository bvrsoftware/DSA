package com.example.dsa.programs;

public class Program1 {
        public static int pivotIndex(int[] nums) {
            int total = 0, leftSum = 0;
            for (int x: nums) total += x;
            for (int i = 0; i < nums.length; ++i) {
                if (leftSum == total - leftSum - nums[i]) return i;
                leftSum += nums[i];
            }
            return -1;
        }
}
