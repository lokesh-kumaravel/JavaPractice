// package BackTracking;

import java.util.Scanner;

public class Maze4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];
        int[][] solution = new int[n][n];
        int[][] best = new int[n][n];
        int m = s.nextInt();
        int l = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
        s.close();
        int count = 1;
        find(m, l, a, solution, best, n, count);
        System.out.println("Minimum Steps: " + mincount);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(best[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int mincount = Integer.MAX_VALUE;

    private static boolean find(int i, int j, int[][] a, int[][] solution, int[][] best, int n, int count) {
        if ((i == n - 1 && j == n - 1 && a[n - 1][n - 1] == 0) || (i == 0 && j == n - 1 && a[0][n - 1] == 0)) {
            solution[i][j] = 1;
            if (count < mincount) {
                mincount = count;
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        best[i][j] = solution[i][j];
                    }
                }
                // return false;
            }
            // solution[i][j] = 0;
            return false;
        }
        if (i >= 0 && i <= n - 1 && j >= 0 && j <= n - 1 && solution[i][j] == 0 && a[i][j] == 0) {
            solution[i][j] = 1;
            if (find(i + 1, j, a, solution, best, n, count + 1)) {
                return true;
            }
            if (find(i, j + 1, a, solution, best, n, count + 1)) {
                return true;
            }
            if (find(i - 1, j, a, solution, best, n, count + 1)) {
                return true;
            }
            if (find(i, j - 1, a, solution, best, n, count + 1)) {
                return true;
            }
            solution[i][j] = 0;
            return false;
        }
        return false;
    }
}