package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class minExtraChar {
    public static void main(String[] args) {
    String s = "leetscode";
    String[] dictionary = {"leet", "code", "leetcode"};

    int maxLen = s.length() + 1;
    int[] dp = new int[maxLen];
    Arrays.fill(dp, maxLen);
    dp[0] = 0;
    Set<String> wordSet = new HashSet<>(Arrays.asList(dictionary));

    for (int i = 1; i < maxLen; i++) {
        dp[i] = dp[i - 1] + 1;
        for (int length = 1; length <= i; length++) {
            String substring = s.substring(i - length, i);
            if (wordSet.contains(substring)) {
                dp[i] = Math.min(dp[i], dp[i - length]);
            }
        }
    }

    System.out.println(dp[maxLen - 1]);
}

}
