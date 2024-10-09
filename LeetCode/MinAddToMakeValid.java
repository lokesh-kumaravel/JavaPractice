package LeetCode;
import java.util.*;

public class MinAddToMakeValid {
    public static void main(String[] args) {
        String s = "()))(("; 
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        int result = stack.size();
        System.out.println("Minimum additions required: " + result);
    }
}
