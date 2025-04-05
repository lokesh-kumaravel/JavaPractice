package DSA;

import java.util.*;

public class SchoolSum {
    public static void main(String[] args) {
        int n = 1;
        int m = 7;
        int k = 5;
        int[][] a = { { 2, 1, 0, 1, 3, 0, 1 } };
        // int[][] a = {
        // { 3, 2, 1, 0, 4 },
        // { 1, 0, 3, 2, 1 },
        // { 2, 3, 0, 4, 2 },
        // { 0, 1, 2, 3, 1 },
        // { 4, 2, 1, 0, 3 },
        // };
        int max = 0;
        boolean[][] visited = new boolean[n][m];
        // int kk = find(a, 2, 3, k + 1, visited);
        // System.out.println(kk);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] != 0) {
                    int kk = find(a, i, j, k + 1, visited);
                    // System.out.println(kk);
                    if (kk != -1) {
                        min = Math.min(kk, min);
                    }
                }
            }
        }
        System.out.println(min);
    }

    public static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 }, { -1, -1 }, { -1, +1 }, { 1, -1 },
            { 1, 1 } };

    public static int find(int[][] a, int i, int j, int cap, boolean[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { i, j, a[i][j] });
        visited[i][j] = true;
        int c = -1;
        int cur = 0;
        while (!q.isEmpty() && cap > 0) {
            int[] ver = q.poll();
            int x = ver[0];
            int y = ver[1];
            int val = ver[2];
            // System.out.println(Arrays.toString(ver));
            if (val != 0) {
                cur += val;
                // System.out.println(cur);
                if (cap <= cur) {
                    // System.out.println(cur);
                    return c;
                }
                c++;
            }
            visited[x][y] = true;
            // System.out.println(c);
            for (int m = 0; m < dir.length; m++) {
                int newX = x + dir[m][0];
                int newY = y + dir[m][1];
                if (isValid(newX, newY, a, visited)) {
                    // System.out.println("cap");
                    q.add(new int[] { newX, newY, a[newX][newY] });
                }
            }
        }
        return -1;
    }

    public static boolean isValid(int i, int j, int[][] a, boolean[][] visited) {
        return (i >= 0 && i < a.length && j >= 0 && j < a[0].length && !visited[i][j]);
    }
}