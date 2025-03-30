package ShortestPath;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 1, 1, 1, 1 },
                { 0, 1, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 1, 0, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 0, 1, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 1, 1, 1, 1, 1 }
        };
        int n = a.length;
        int m = a[0].length;
        int ans = find(0, 0, n - 1, m - 1, a);
        System.out.println("Shortest Path : " + ans);
        // firstLoop: for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // if (i == 3) {
        // break firstLoop;
        // }
        // }
        // System.out.println(i);
        // }
    }

    public static int destination[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public static int find(int x, int y, int dx, int dy, int[][] a) {
        int n = a.length;
        int m = a.length;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { x, y, 0 });
        boolean visited[][] = new boolean[n][m];
        visited[x][y] = true;
        while (!queue.isEmpty()) {
            int val[] = queue.poll();
            int srcX = val[0];
            int srcY = val[1];
            int dest = val[2];
            System.out.println(Arrays.toString(val));
            if (dx == srcX && dy == srcY) {
                return dest;
            }
            for (int[] cur : destination) {
                if (isValid(cur[0] + srcX, cur[1] + srcY, a, visited)) {
                    queue.add(new int[] { cur[0] + srcX, cur[1] + srcY, dest + 1 });
                    visited[cur[0] + srcX][cur[1] + srcY] = true;
                }
            }
        }
        return -1;
    }

    private static boolean isValid(int i, int j, int[][] a, boolean[][] visited) {
        if (i >= 0 && i < a.length && j >= 0 && j < a[0].length && a[i][j] == 1 && !visited[i][j]) {
            return true;
        }
        return false;
    }
}