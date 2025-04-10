// package csef;

import java.util.*;

public class KnightsTour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt() - 1;
        int y = s.nextInt() - 1;
        int[][] a = new int[8][8];
        boolean[][] visited = new boolean[8][8];
        boolean solved = Backtrack(x, y, a, visited, 1);
        if (solved) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static boolean Backtrack(int i, int j, int[][] a, boolean[][] visited, int c) {
        if (c == 65) {
            return true;
        }
        visited[i][j] = true;
        a[i][j] = c;
        int[] dx = { 2, 2, -2, -2, 1, 1, -1, -1 };
        int[] dy = { 1, -1, 1, -1, 2, -2, 2, -2 };

        for (int k = 0; k < 8; k++) {
            int newX = i + dx[k];
            int newY = j + dy[k];
            if (isValid(newX, newY, a, visited)) {
                if (Backtrack(newX, newY, a, visited, c + 1)) {
                    return true;
                }
            }
        }
        a[i][j] = 0;
        visited[i][j] = false;
        return false;
    }

    public static boolean isValid(int i, int j, int[][] a, boolean[][] visited) {
        return (i >= 0 && i < 8 && j >= 0 && j < 8 && !visited[i][j] && a[i][j] == 0);
    }
}
