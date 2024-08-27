package DP;

public class Mainfind {
    public static int[][] a = {
            { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 9, 9, 9, 9, 1, 1, 1, 1, 0, 1 },
            { 1, 1, 1, 9, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 9, 1, 0, 1, 1, 1, 1 },
            { 1, 1, 1, 9, 1, 1, 1, 1, 1, 1 },
            { 1, 0, 1, 9, 9, 9, 9, 9, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 9, 1, 0 },
            { 1, 1, 1, 1, 1, 0, 1, 9, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 9, 9, 9 }
    };
    public static int n = 10;

    public static void main(String[] args) {
        int r = -1;
        for (int i = 0; i < n; i++) {
            if (a[i][0] == 9) {
                r = i;
                break;
            }
        }
        find(r, 0);
    }

    private static boolean find(int i, int j) {
        if (j == n - 1 && a[i][j] == 9) {
            int row = i + 1;
            int column = j + 1;
            System.out.println(row + " " + column);
            return true;
        }
        if (i >= 0 && i < n && j >= 0 && j < n && a[i][j] == 9) {
            int row = i + 1;
            int column = j + 1;
            System.out.println(row + " " + column);
            a[i][j] = 8;
            if (find(i, j + 1)) {
                return true;
            }
            if (find(i - 1, j)) {
                return true;
            }
            if (find(i, j - 1)) {
                return true;
            }
            if (find(i + 1, j)) {
                return true;
            }
            a[i][j] = 9;
            return false;
            // return false;
        }
        return false;
    }
}