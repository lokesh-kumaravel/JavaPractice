package DSA;

import java.util.*;

public class SchoolSum {
    public static void main(String[] args) {
        int n = 3;
        int m = 2;
        int k = 3;
        // int[][] a = { { 2, 1, 0, 1, 3, 0, 1 } };
        // int[][] a = {
        // { 3, 2, 1, 0, 4 },
        // { 1, 0, 3, 2, 1 },
        // { 2, 3, 0, 4, 2 },
        // { 0, 1, 2, 3, 1 },
        // { 4, 2, 1, 0, 3 },
        // };
        int[][] a = { { 0, 2 }, { 1, 0 }, { 1, 0 } };
        int min = Integer.MAX_VALUE;
        int availableCapacity = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] != 0) {
                    availableCapacity += a[i][j];
                    int kk = find(a, i, j, k + 1);
                    if (kk != -1) {
                        min = Math.min(kk, min);
                    }
                }
            }
        }
        if (availableCapacity < k + 1) {
            System.out.println("Rooms not available...");
            return;
        }
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }

    public static int[][] dir = {
            { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 },
            { -1, -1 }, { -1, +1 }, { 1, -1 }, { 1, 1 }
    };

    public static int find(int[][] a, int i, int j, int cap) {
        int n = a.length, m = a[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { i, j });
        visited[i][j] = true;
        int level = 0;
        int currentCapacity = 0;
        // System.out.println(currentCapacity + " but cap : " + cap);
        while (!q.isEmpty()) {
            int size = q.size();

            for (int s = 0; s < size; s++) {
                int[] curr = q.poll();
                // System.out.println(Arrays.toString(curr));
                int x = curr[0], y = curr[1];

                currentCapacity += a[x][y];
                if (currentCapacity >= cap) {
                    // System.out.println(currentCapacity + " but cap : " + cap + " level : " +
                    // level);
                    return level;
                }

                for (int[] d : dir) {
                    int nx = x + d[0], ny = y + d[1];
                    if (isValid(nx, ny, a, visited)) {
                        visited[nx][ny] = true;
                        q.add(new int[] { nx, ny });
                    }
                }
            }
            level++;
        }

        return -1;
    }

    public static boolean isValid(int i, int j, int[][] a, boolean[][] visited) {
        return i >= 0 && i < a.length && j >= 0 && j < a[0].length && !visited[i][j];
    }
}
