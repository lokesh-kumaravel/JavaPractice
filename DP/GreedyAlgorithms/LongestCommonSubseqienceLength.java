package DP.GreedyAlgorithms;

import java.util.*;

public class LongestCommonSubseqienceLength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] a = s.next().toCharArray();
        char[] b = s.next().toCharArray();
        int[][] dp = new int[a.length + 1][b.length + 1];
        for (int i = 1; i <= a.length; i++) {
            for (int j = 1; j <= b.length; j++) {
                if (a[i - 1] == b[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int result = (a.length + b.length) - dp[a.length][b.length];
        System.out.println(result);
        s.close();
    }
}

// import java.util.Scanner;
// public class Main {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// String str1 = scanner.nextLine();
// String str2 = scanner.nextLine();
// int shortestSupersequenceLength = shortestCommonSupersequenceLength(str1,
// str2);
// System.out.println(shortestSupersequenceLength);
// scanner.close();
// }
// public static int shortestCommonSupersequenceLength(String str1, String str2)
// {
// int m = str1.length();
// int n = str2.length();

// // Step 1: Calculate the length of LCS
// int[][] dp = new int[m + 1][n + 1];

// for (int i = 1; i <= m; i++) {
// for (int j = 1; j <= n; j++) {
// if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
// dp[i][j] = 1 + dp[i - 1][j - 1];
// } else {
// dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
// }
// }
// }

// int lcsLength = dp[m][n];
// int shortestSupersequenceLength = m + n - lcsLength;

// return shortestSupersequenceLength;
// }
// }

// package DP.GreedyAlgorithms;

// public class LongestCommonSubseqienceLength {
// public static void main(String[] args) {
// char[] a = {'g','e','e','k'};
// char[] b = {'e','k','e'};
// int[][] dp = new int[a.length+1][b.length+1];
// for(int i = 1;i<=a.length;i++)
// {
// for(int j = 1;j<=b.length;j++)
// {
// if(a[i-1]==b[j-1])
// {
// dp[i][j] = 1+dp[i-1][j-1];
// }
// else
// {
// dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
// }
// }
// }
// for(int i = 0;i<=a.length;i++)
// {
// for(int j = 0;j<=b.length;j++)
// {
// System.out.print(dp[i][j]+" ");
// }
// System.out.println();
// }
// System.out.println("The Longest Common subsequence is :
// "+dp[a.length][b.length]);
// }
// }