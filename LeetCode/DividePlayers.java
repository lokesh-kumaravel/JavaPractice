package LeetCode;
import java.util.*;

public class DividePlayers {
    public static long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long total = 0;
        int n = skill.length;
        
        for (int i = 0; i < n / 2; i++) {
            if (skill[i] + skill[n - i - 1] != skill[0] + skill[n - 1]) {
                return -1; 
            }
            total += skill[i] * skill[n - i - 1];
        }
        
        return total; 
    }

    public static void main(String[] args) {
        int[] skill = {3, 2, 5, 1, 3, 4};
        long result = dividePlayers(skill);
        if (result == -1) {
            System.out.println("Not possible to divide players evenly.");
        } else {
            System.out.println("Total skill product sum: " + result);
        }
    }
}
