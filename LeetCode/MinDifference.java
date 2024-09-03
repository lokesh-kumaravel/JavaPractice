package LeetCode;

import java.util.Arrays;

public class MinDifference {
    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 5, 6, 14, 15};
        
        // Edge case check
        int n = nums.length;
        if (n < 4) {
            System.out.println("Minimum Difference: 0");
            return;
        }

        // Sort the array
        Arrays.sort(nums);

        // Compute the minimum difference
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            min = Math.min(min, nums[n - 4 + i] - nums[i]);
        }

        // Print the result
        System.out.println("Minimum Difference: " + min);
    }
}
