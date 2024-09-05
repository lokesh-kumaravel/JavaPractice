package LeetCode;

import java.util.Arrays;

public class MissingRolls {
    public static void main(String[] args) {
        int[] rolls = {4, 5, 6, 2, 3, 6, 5, 4, 6, 4, 5, 1, 6, 3, 1, 4, 5, 5, 3, 2, 3, 5, 3, 2, 1, 5, 4, 3, 5, 1, 5};
        int mean = 4; 
        int n = 5; 
        int sum = 0;
        for (int roll : rolls) {
            sum += roll;
        }

        // Calculate the required total sum for all dice rolls
        int totalSum = (rolls.length + n) * mean;

        // Calculate the sum needed from the missing rolls
        int missingSum = totalSum - sum;

        // Check if it's possible to distribute the missing sum across n dice
        if (missingSum < n || missingSum > 6 * n) {
            System.out.println(Arrays.toString(new int[0])); // Impossible case
            return;
        }

        // Create an array for the missing rolls
        int[] result = new int[n];
        int divide = missingSum / n;
        int rem = missingSum % n;

        // Fill the array with the base value
        Arrays.fill(result, divide);

        // Distribute the remainder
        for (int i = 0; i < rem; i++) {
            result[i]++;
        }

        // Print the result
        System.out.println(Arrays.toString(result));
    }
}
