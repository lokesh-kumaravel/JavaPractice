package LeetCode;

import java.util.Stack;

public class MinLength {
    public static void main(String[] args) {
        String[] testCases = {
            "ABCD",
            "AAABBBCCC",
            "AABBC",
            "CDAA",
            "BBAAACCD"
        };

        for (String s : testCases) {
            System.out.println("Min length of \"" + s + "\": " + minLength(s));
        }
    }

    public static int minLength(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            if (currentChar == 'B') {
                if (!stack.isEmpty()) {
                    char ch = stack.pop();
                    if (ch == 'A') {
                        continue; 
                    } else {
                        stack.push(ch);
                    }
                }
                stack.push(currentChar);
            } else if (currentChar == 'D') {
                if (!stack.isEmpty()) {
                    char ch = stack.pop();
                    if (ch == 'C') {
                        continue; 
                    } else {
                        stack.push(ch);
                    }
                }
                stack.push(currentChar);
            } else {
                stack.push(currentChar);
            }
        }
        
        return stack.size();
    }
}
