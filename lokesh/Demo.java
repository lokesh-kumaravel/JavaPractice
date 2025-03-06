package lokesh;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        int n = 43;
        ArrayList<Integer> result = find(n);
        System.out.println(result);
        StringOperations obj = new StringOperations();
        System.out.println(obj.s1);
    }

    private static ArrayList<Integer> find(int n) {
        int[] coin = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };
        int[] dp = new int[n + 1];
        int[] prev = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = coin[i]; j < n + 1; j++) {
                if (dp[j - coin[i]] < dp[j]) {
                    dp[j] = dp[j - coin[i]] + 1;
                    prev[j] = coin[i];
                }
            }
        }

        int current = n;
        ArrayList<Integer> result = new ArrayList<>();
        while (current > 0) {
            result.add(prev[current]);
            current = current - prev[current];
        }
        return result;
    }
}