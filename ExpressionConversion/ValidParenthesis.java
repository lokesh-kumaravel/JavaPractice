package ExpressionConversion;

import java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "()[{}()]";
        if (isValid(str)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            else {
                if (stack.isEmpty())
                    return false;
                char cur = stack.pop();
                if ((ch == ')' && cur == '(') || (ch == ']' && cur == '[') || (ch == '}' && cur == '{'))
                    continue;
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}