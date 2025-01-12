package LeetCode;

import java.util.Arrays;

public class largestNumber {
    public static void main(String[] args) {
        int[] nums = { 3, 30, 34, 5, 9 };

        // Convert integers to strings
        String[] array = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = String.valueOf(nums[i]);
        }

        // Sort the strings using custom comparator
        Arrays.sort(array, (a, b) -> (b + a).compareTo(a + b));

        // Handle the case where the largest number is "0"
        if (array[0].equals("0")) {
            System.out.println("0");
            return;
        }

        // Concatenate the sorted strings
        StringBuilder largest = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            largest.append(array[i]);
        }

        // Print the result
        System.out.println(largest.toString());
    }
}
