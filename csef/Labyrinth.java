package csef;

import java.util.*;

public class Labyrinth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        s.nextLine();
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            String line = s.nextLine();
            for (int j = 0; j < m; j++) {
                a[i][j] = line.charAt(j);
            }
        }
        int startX = -1;
        int startY = -1;
        int endX = -1;
        int endY = -1;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 'A') {
                    startX = i;
                    startY = j;
                } else if (a[i][j] == 'B') {
                    endX = i;
                    endY = j;
                }
            }
        }
        bfs(startX, startY, endX, endY, a, visited);
    }

    public static int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
    public static char[] move = { 'R', 'D', 'L', 'U' };

    public static void bfs(int startX, int startY, int endX, int endY, char[][] a, boolean[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { startX, startY });
        char[][] parent = new char[a.length][a[0].length];
        visited[startX][startY] = true;
        while (!q.isEmpty()) {
            int[] d = q.poll();
            int x = d[0];
            int y = d[1];
            for (int i = 0; i < 4; i++) {
                int newX = x + directions[i][0];
                int newY = y + directions[i][1];
                if (isValid(newX, newY, a, visited)) {
                    parent[newX][newY] = move[i];
                    q.add(new int[] { newX, newY });
                    visited[newX][newY] = true;
                }
            }
        }
        if (!visited[endX][endY]) {
            System.out.println("NO");
            return;
        }
        int x = endX;
        int y = endY;
        StringBuilder sb = new StringBuilder();
        while (x != startX || y != startY) {
            char ch = parent[x][y];
            sb.append(ch);
            if (ch == 'U') {
                x += 1;
            } else if (ch == 'D') {
                x -= 1;
            } else if (ch == 'R') {
                y -= 1;
            } else if (ch == 'L') {
                y += 1;
            }
        }
        for (int i = 0; i < parent.length; i++) {
            System.out.println(Arrays.toString(parent[i]));
        }
        sb = sb.reverse();
        System.out.println("YES");
        System.out.println(sb.length());
        System.out.println(sb.toString());
    }

    public static boolean isValid(int i, int j, char[][] a, boolean[][] visited) {
        return (i >= 0 && i < a.length && j >= 0 && j < a[0].length && a[i][j] != '#' && !visited[i][j]);
    }
}
