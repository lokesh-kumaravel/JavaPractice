import java.util.*;

public class Maze3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][n];
        int[][] solution = new int[n][n];
        int[][] best = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
        int count = 1;
        ans(0, 0, n, a, solution, best, count);
        System.out.println("Minimum Steps: " + mincount);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(best[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int mincount = Integer.MAX_VALUE;

    public static boolean ans(int i, int j, int n, int[][] a, int[][] solution, int[][] best, int count) {
        if (i == n - 1 && j == n - 1 && count < mincount && a[i][j] != 1) {
            solution[i][j] = 1;
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    best[k][l] = solution[k][l];
                }
            }
            mincount = count;
        }
        if (i >= 0 && i < n && j >= 0 && j < n && a[i][j] == 0 && solution[i][j] == 0 && count < mincount) {
            solution[i][j] = 1;
            if (ans(i + 1, j, n, a, solution, best, count + 1)) {
                return true;
            }
            if (ans(i, j + 1, n, a, solution, best, count + 1)) {
                return true;
            }
            if (ans(i - 1, j, n, a, solution, best, count + 1)) {
                return true;
            }
            if (ans(i, j - 1, n, a, solution, best, count + 1)) {
                return true;
            }
            solution[i][j] = 0;
            return false;
        }
        return false;
    }
}