// package csef;

import java.util.*;

public class KnightsTour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt() - 1;
        int y = s.nextInt() - 1;
        int[][] a = new int[8][8];
        dfs(x, y, a);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] directions = {
            { 2, 1 },
            { 2, -1 },
            { -2, 1 },
            { -2, -1 },
            { 1, 2 },
            { 1, -2 },
            { -1, 2 },
            { -1, -2 }
    };

    public static void dfs(int i, int j, int[][] a) {
        boolean[][] visited = new boolean[8][8];
        Stack<int[]> stack = new Stack<>();
        a[i][j] = 1;
        visited[i][j] = true;
        int c = 1;
        stack.push(new int[] { i, j });
        while (!stack.isEmpty()) {
            int[] d = stack.pop();
            int x = d[0];
            int y = d[1];
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if (isValid(newX, newY, a, visited)) {
                    c++;
                    visited[newX][newY] = true;
                    a[newX][newY] = c;
                    stack.push(new int[] { newX, newY });
                }
            }
        }
    }

    public static boolean isValid(int i, int j, int[][] a, boolean[][] visited) {
        return (i >= 0 && i < 8 && j >= 0 && j < 8 && !visited[i][j] && a[i][j] == 0);
    }
}
