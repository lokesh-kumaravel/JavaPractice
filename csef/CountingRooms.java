
import java.util.*;

public class CountingRooms {

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
        boolean[][] visited = new boolean[n][m];
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == '.' && !visited[i][j]) {
                    bfs(i, j, a, visited);
                    c++;
                }
            }
        }
        System.out.println(c);
    }

    static int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public static void bfs(int i, int j, char[][] a, boolean[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { i, j });
        visited[i][j] = true;
        while (!q.isEmpty()) {
            int[] d = q.poll();
            int x = d[0];
            int y = d[1];
            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];
                if (isValid(newX, newY, a, visited)) {
                    q.add(new int[] { newX, newY });
                    a[newX][newY] = '#';
                    visited[newX][newY] = true;
                }
            }
        }
    }

    public static boolean isValid(int i, int j, char[][] a, boolean[][] visited) {
        if (i >= 0 && i < a.length && j >= 0 && j < a[0].length && !visited[i][j] && a[i][j] != '#') {
            return true;
        }
        return false;
    }
}