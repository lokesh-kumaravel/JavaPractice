package Level4.Codeforces;

import java.util.*;

public class Increasedeccopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n + 1; i++) {
                b[i] = scanner.nextInt();
            }
            int minOperations = minOperations(a, b);
            System.out.println(minOperations);
        }
        scanner.close();
    }

    private static int minOperations(int[] a, int[] b) {
        int positiveDiff = 0;
        int negativeDiff = 0;
        int maxA = a[0];
        for (int i = 0; i < a.length; i++) {
            int diff = b[i] - a[i];
            if (diff > 0) {
                positiveDiff += diff;
            } else {
                negativeDiff -= diff;
            }
            maxA = Math.max(maxA, a[i]);
        }
        int lastDiff = b[b.length - 1] - maxA;
        if (lastDiff > 0) {
            positiveDiff += lastDiff;
        } else {
            negativeDiff -= lastDiff;
        }
        return Math.max(positiveDiff, negativeDiff);
    }
}
