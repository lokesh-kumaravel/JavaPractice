package ExpressionConversion;

import java.util.HashMap;

public class FibonacciMemo {

    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fibRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRec(n - 2) + fibRec(n - 1);
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("Fibonacci series using recurtion : " + fibRec(n));
        System.out.println("Fibonacci series : " + fib(n));
        // for (int i = 0; i < n; i++) {
        // System.out.print(fib(i) + " ");
        // }
    }
}
