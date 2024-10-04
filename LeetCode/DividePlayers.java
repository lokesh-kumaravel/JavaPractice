package LeetCode;
import java.util.*;

public class DividePlayers {
    public static long dividePlayers(int[] skill) {
        // Sort the array of skill levels
        Arrays.sort(skill);
        long total = 0;
        int n = skill.length;
        
        // Loop to pair players from start and end of the sorted array
        for (int i = 0; i < n / 2; i++) {
            // Check if the sum of paired players is consistent
            if (skill[i] + skill[n - i - 1] != skill[0] + skill[n - 1]) {
                return -1; // Return -1 if not consistent
            }
            // Multiply the paired players' skills and add to the total
            total += skill[i] * skill[n - i - 1];
        }
        
        return total; // Return the total sum
    }

    public static void main(String[] args) {
        // Example input array of player skill levels
        int[] skill = {3, 2, 5, 1, 3, 4};
        
        // Call the dividePlayers function and print the result
        long result = dividePlayers(skill);
        if (result == -1) {
            System.out.println("Not possible to divide players evenly.");
        } else {
            System.out.println("Total skill product sum: " + result);
        }
    }
}
