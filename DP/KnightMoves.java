
package DP;

import java.util.*;

public class KnightMoves {
    public static void main(String[] args) {
        System.out.println(makeSol(new int[] { 1, 1 }, 200, new int[] { 0, 0 }));
    }

    public static int makeSol(int[] start, int boardSize, int[] end) {
        int step = 0;
        int[][] sol = new int[boardSize][boardSize];
        sol[start[0]][start[1]] = -1; // Use -1 to mark the starting position

        int[] dx = { 1, 2, 1, 2, -1, -2, -1, -2 };
        int[] dy = { 2, 1, -2, -1, 2, 1, -2, -1 };

        Queue<int[]> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            step++;
            int size = queue.size();
            int[] temp = queue.poll();
            System.out.println(Arrays.toString(temp));
            int x = temp[0];
            int y = temp[1];

            for (int j = 0; j < 8; j++) {
                int newX = x + dx[j];
                int newY = y + dy[j];

                if (isValidMove(newX, newY, boardSize, sol)) {
                    sol[newX][newY] = step;
                    queue.add(new int[] { newX, newY });
                    if (newX == end[0] && newY == end[1]) {
                        return sol[newX][newY];
                    }
                }
            }
            // System.out.println(Arrays.toString(sol));
        }

        // KnightMoves.printSol(sol);
        return sol[end[0]][end[1]];
    }

    private static boolean isValidMove(int x, int y, int boardSize, int[][] sol) {
        return boardSize > x && x >= 0 && boardSize > y && y >= 0 && sol[x][y] == 0;
    }

    private static void printSol(int[][] sol) {
        System.out.println(Arrays.toString(sol));
        // for (int[] row : sol) {
        // for (int cell : row) {
        // System.out.print(cell + " ");
        // }
        // System.out.println();
        // }
    }
}