package LeetCode;

public class CountIsland2Grids {
    public static void main(String[] args) {
        // Define the grids
        int[][] grid1 = {
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 1, 1, 0},
            {0, 0, 1, 1, 1},
            {0, 0, 0, 0, 0}
        };
        int[][] grid2 = {
            {1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0},
            {0, 0, 1, 1, 0},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 0, 0}
        };
        
        // Create an instance of CountIsland2Grids and call countSubIslands
        CountIsland2Grids instance = new CountIsland2Grids();
        int result = instance.countSubIslands(grid1, grid2);
        System.out.println("Number of sub-islands: " + result);
    }

    // Method to count sub-islands
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int n = grid1.length;
        int m = grid1[0].length;
        int c = 0;
        
        // Remove parts of grid2 that are not sub-islands
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid2[i][j] != grid1[i][j]) {
                    mark(i, j, grid1, grid2, n, m);
                }
            }
        }
        
        // Count the remaining islands in grid2 which are sub-islands
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid2[i][j] == 1) {
                    count(i, j, grid2, n, m);
                    c++;
                }
            }
        }
        
        return c;
    }

    // Helper method to mark cells that are not part of sub-islands
    private void mark(int i, int j, int[][] grid1, int[][] grid2, int n, int m) {
        if (i >= 0 && i < n && j >= 0 && j < m && grid2[i][j] == 1) {
            grid2[i][j] = 0;
            mark(i, j + 1, grid1, grid2, n, m);
            mark(i + 1, j, grid1, grid2, n, m);
            mark(i - 1, j, grid1, grid2, n, m);
            mark(i, j - 1, grid1, grid2, n, m);
        }
    }

    // Helper method to count and mark the islands in grid2
    private void count(int i, int j, int[][] grid2, int n, int m) {
        if (i >= 0 && i < n && j >= 0 && j < m && grid2[i][j] == 1) {
            grid2[i][j] = 0;
            count(i + 1, j, grid2, n, m);
            count(i - 1, j, grid2, n, m);
            count(i, j + 1, grid2, n, m);
            count(i, j - 1, grid2, n, m);
        }
    }
}
