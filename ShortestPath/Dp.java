package ShortestPath;

import java.util.Arrays;

public class Dp {
    public static int findShortestPath(int[][] grid) {
        int R = grid.length, C = grid[0].length;
        int[][] dp = new int[R][C];

        for (int[] row : dp)
            Arrays.fill(row, Integer.MAX_VALUE);

        if (grid[0][0] == 1)
            dp[0][0] = 1;
        else
            return -1;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }

                if (i > 0 && dp[i - 1][j] != Integer.MAX_VALUE) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
                }

                if (j > 0 && dp[i][j - 1] != Integer.MAX_VALUE) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
                }
            }
        }

        return dp[R - 1][C - 1] == Integer.MAX_VALUE ? -1 : dp[R - 1][C - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 1, 1, 1, 1, 0 },
                { 0, 1, 0, 1, 1 },
                { 1, 1, 0, 0, 1 },
                { 1, 0, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 0, 1, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 1, 1, 1, 1, 1 }
        };

        int result = findShortestPath(grid);
        System.out.println(result != -1 ? "Shortest Path Length: " + result : "-1 (No Path)");
    }
}
