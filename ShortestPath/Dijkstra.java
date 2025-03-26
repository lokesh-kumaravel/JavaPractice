package ShortestPath;

import java.util.*;

public class Dijkstra {
    private static final int[] dx = { 0, 0, 1, -1 };
    private static final int[] dy = { 1, -1, 0, 0 };

    public static int findShortestPath(int[][] grid) {
        int R = grid.length, C = grid[0].length;
        int[][] dist = new int[R][C];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[0][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        pq.offer(new int[] { 0, 0, 0 });

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int x = curr[0], y = curr[1], d = curr[2];

            if (x == R - 1 && y == C - 1)
                return d;

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i], newY = y + dy[i];

                if (isValid(newX, newY, R, C, grid) && dist[newX][newY] > d + 1) {
                    dist[newX][newY] = d + 1;
                    pq.offer(new int[] { newX, newY, dist[newX][newY] });
                }
            }
        }
        return -1;
    }

    private static boolean isValid(int x, int y, int R, int C, int[][] grid) {
        return x >= 0 && x < R && y >= 0 && y < C && grid[x][y] == 1;
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
