package DP;

import java.util.Arrays;

public class AntFloor2 {
    public static int n = 3;
    public static int[][] a = {
            { 1, 2, 3 },
            { 4, 4, 4 },
            { 4, 4, 4 }
    };
    public static int[][] main = new int[n][n];

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        main[k][l] = 0;
                    }
                }
                count = 0;
                maxcount = 0;
                find(i, j, main, count);
                break;
            }
            break;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(main[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(maxcount);
    }

    public static int count = 0;
    public static int maxcount = 0;

    private static boolean find(int i, int j, int[][] main, int count) {
        if (count > maxcount) {
            maxcount = count;
            // System.out.println(count);
            if (count > maxcount) {
                maxcount = count;
            }
            // if(i==n-1&&j==n-1)
            // {
            // return true;
            // }
        }
        if (i >= 0 && i < n && j >= 0 && j < n && main[i][j] == 0 && a[i][j] == a[i][j]) {
            main[i][j] = 11;
            if (find(i, j + 1, main, count)) {
                if (j + 1 < n)
                    if (a[i][j + 1] - 1 == a[i][j] || a[i][j + 1] == a[i][j] - 1) {
                        count++;
                        return true;
                    }
            }
            if (find(i + 1, j, main, count)) {
                if (i + 1 < n)
                    if (a[i + 1][j] == a[i][j] - 1 || a[i + 1][j] == a[i][j] + 1) {
                        count++;
                        return true;
                    }
            }
            if (find(i, j - 1, main, count)) {
                if (j - 1 >= 0)
                    if (a[i][j - 1] == a[i][j] - 1 || a[i][j] == a[i][j - 1] + 1) {
                        count++;
                        return true;
                    }
            }
            if (find(i - 1, j, main, count)) {
                if (i - 1 >= 0)
                    if (a[i - 1][j] == a[i][j] - 1 || a[i - 1][j] == a[i][j] + 1) {
                        count++;
                        return true;
                    }
            }
            main[i][j] = 0;
            return false;
        }
        return false;
    }
}