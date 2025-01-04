package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class countPalindromicSubsequence {
    public static void main(String[] args) {
        String s = "aabca";
        int res = 0;
        Set<Character> uniq = new HashSet<>();

        // Collect unique characters from the string
        for (char c : s.toCharArray()) {
            uniq.add(c);
        }

        // Iterate over each unique character
        for (char c : uniq) {
            int start = s.indexOf(c);
            int end = s.lastIndexOf(c);

            // If the character appears more than once, we can form palindromic subsequences
            if (start < end) {
                Set<Character> charSet = new HashSet<>();
                // Collect characters between the first and last occurrence of the character
                for (int i = start + 1; i < end; i++) {
                    charSet.add(s.charAt(i));
                }
                res += charSet.size();
            }
        }

        // Output the result
        System.out.println(res);
    }
}
