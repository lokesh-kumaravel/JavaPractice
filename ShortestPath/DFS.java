package ShortestPath;

public class DFS {
    private static final int[][] directions = {
            { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 }
    };

    private static int minDistance = Integer.MAX_VALUE;

    public static int shortestPath(int[][] maze, int startX, int startY, int endX, int endY) {
        int rows = maze.length, cols = maze[0].length;
        boolean[][] visited = new boolean[rows][cols];

        dfs(maze, startX, startY, endX, endY, visited, 0);

        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
    }

    private static void dfs(int[][] maze, int x, int y, int endX, int endY, boolean[][] visited, int steps) {
        if (x == endX && y == endY) {
            minDistance = Math.min(minDistance, steps);
            return;
        }

        visited[x][y] = true;

        for (int[] dir : directions) {
            int newX = x + dir[0], newY = y + dir[1];

            if (isValid(maze, newX, newY, visited)) {
                dfs(maze, newX, newY, endX, endY, visited, steps + 1);
            }
        }

        visited[x][y] = false;
    }

    private static boolean isValid(int[][] maze, int x, int y, boolean[][] visited) {
        return x >= 0 && y >= 0 && x < maze.length && y < maze[0].length &&
                maze[x][y] == 1 && !visited[x][y];
    }

    public static void main(String[] args) {
        int[][] maze = {
                { 1, 1, 1, 1, 1 },
                { 0, 1, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 1, 0, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 0, 1, 0, 0, 1 },
                { 1, 1, 0, 0, 1 },
                { 1, 1, 1, 1, 1 }
        };

        int startX = 0, startY = 0, endX = 7, endY = 4;
        int result = shortestPath(maze, startX, startY, endX, endY);

        System.out.println(result != -1 ? "Shortest Path Length: " + result : "No path exists.");
    }
}