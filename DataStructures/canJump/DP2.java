package DataStructures.canJump;

import java.util.*;

public class DP2 {
    public static void main(String[] args) {
        int[] a = { 2, 3, 1, 1, 4 };
        int ans = find(a);
        System.out.println(ans);
    }

    public static int find(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (j + nums[j] >= i)
                    dp[i] = Math.min(dp[i], dp[j] + 1);
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[n - 1];
    }
}