package ExpressionConversion;

import java.util.*;

public class InfixToPostfix {
    public static void main(String[] args) {
        String str = "(p+q)*(m-n)";
        String ans = convertInfixToPostFix(str);
        System.out.println("PostFix expression : " + ans);
    }

    public static String convertInfixToPostFix(String str) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('+', 1);
        map.put('-', 1);
        map.put('*', 2);
        map.put('/', 2);
        map.put('^', 3);
        map.put('(', -1);
        map.put(')', -1);
        // System.out.println(map);
        String ans = new String("");
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                ans += ch;
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && map.get(stack.peek()) >= map.get(ch)) {
                    ans += stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}

// Time Complexity: O(N)

// Space Complexity: O(N) for using the stack