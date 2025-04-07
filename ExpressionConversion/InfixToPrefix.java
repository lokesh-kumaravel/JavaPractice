package ExpressionConversion;

import java.util.*;

public class InfixToPrefix {
    public static void main(String[] args) {
        String infix = "(p+q)*(m-n)";
        String prefix = convertInfixToPrefix(infix);
        System.out.println("Prefix expression: " + prefix);
    }

    public static String convertInfixToPrefix(String infix) {
        String rev = new StringBuilder(infix).reverse().toString();
        StringBuilder str = new StringBuilder();

        for (char ch : rev.toCharArray()) {
            if (ch == '(')
                str.append(')');
            else if (ch == ')')
                str.append('(');
            else
                str.append(ch);
        }

        String postfix = convertToPostfix(str.toString());

        return new StringBuilder(postfix).reverse().toString();
    }

    public static String convertToPostfix(String str) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('+', 1);
        map.put('-', 1);
        map.put('*', 2);
        map.put('/', 2);
        map.put('^', 3);

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                while (!stack.isEmpty() && map.containsKey(stack.peek()) &&
                        map.get(stack.peek()) >= map.get(ch)) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
