package Level4;

import java.util.*;

public class Removeunbalanced {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] a = s.next().toCharArray();
        s.close();
        Stack<Integer> stack = new Stack<>();
        boolean[] remove = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '(') {
                stack.push(i);
            } else if (a[i] == ')') {
                if (stack.isEmpty()) {
                    remove[i] = true;
                } else {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            remove[stack.pop()] = true;
        }
        for (int i = 0; i < a.length; i++) {
            if (!remove[i]) {
                System.out.print(a[i]);
            }
        }
    }
}