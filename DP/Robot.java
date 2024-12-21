package DP;

import java.util.Scanner;

public class Robot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        s.close();
        int[][] a = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (j == 1 || i == 1) {
                    a[i][j] = 1;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i][j] == 0) {
                    a[i][j] = a[i][j - 1] + a[i - 1][j];
                }
            }
        }
        System.out.println(a[n][m]);
    }
}
