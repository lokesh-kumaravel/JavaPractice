package ShortestPath;

import java.util.Arrays;

public class BackTracking {
    private static int minPath = Integer.MAX_VALUE;

    private static boolean find(int i, int j, int[][] a, int[][] solution, int n, int steps) {
        if (i == n - 1 && j == a[0].length - 1) {
            solution[i][j] = 1;
            minPath = Math.min(minPath, steps);
            return true;
        }

        if (isValid(i, j, a, solution, n)) {
            solution[i][j] = 1;
            if (find(i, j + 1, a, solution, n, steps + 1)) {
                return true;
            }
            if (find(i + 1, j, a, solution, n, steps + 1)) {
                return true;
            }
            if (find(i, j - 1, a, solution, n, steps + 1)) {
                return true;
            }
            if (find(i - 1, j, a, solution, n, steps + 1)) {
                return true;
            }

            solution[i][j] = 0;
        }
        return false;
    }

    private static boolean isValid(int i, int j, int[][] a, int[][] solution, int n) {
        return i >= 0 && i < n && j >= 0 && j < a[0].length && a[i][j] == 1 && solution[i][j] == 0;
    }

    public static void main(String[] args) {
        int[][] a = {
                { 1, 1, 1, 1, 0 },
                { 0, 1, 0, 1, 1 },
                { 1, 1, 0, 0, 1 },
                { 1, 0, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 0, 1, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 1, 1, 1, 1, 1 }
        };
        int n = a.length;
        int m = a[0].length;

        int[][] solution = new int[n][m];

        boolean found = find(0, 0, a, solution, n, 0);

        if (found && minPath != Integer.MAX_VALUE) {
            System.out.println("Shortest Path Length: " + minPath);
            printSolution(solution);
        } else {
            System.out.println("-1");
        }
    }

    private static void printSolution(int[][] solution) {
        for (int[] row : solution) {
            System.out.println(Arrays.toString(row));
        }
    }
}
