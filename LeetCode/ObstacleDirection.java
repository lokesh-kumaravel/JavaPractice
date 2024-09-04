package LeetCode;

import java.util.*;

public class ObstacleDirection {
    public static void main(String[] args) {
        int[] commands = {4, -1, 3};
        int[][] obstacles = {{2, 4}};
        
        int result = robotSim(commands, obstacles);
        
        System.out.println("Maximum distance squared: " + result);
    }

    public static int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        int d = 0;
        int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
        int maxdistance = 0;
        Set<String> obstacleSet = new HashSet<>();
        
        for (int[] obs : obstacles) {
            obstacleSet.add(obs[0] + "," + obs[1]);
        }
        
        for (int i = 0; i < commands.length; i++) {
            if (commands[i] == -1) {
                d = (d + 1) % 4;
            } else if (commands[i] == -2) {
                d = (d + 3) % 4;
            } else {
                for (int j = 0; j < commands[i]; j++) {
                    int dx = x + direction[d][0];
                    int dy = y + direction[d][1];
                    if (obstacleSet.contains(dx + "," + dy)) {
                        break;
                    }
                    x = dx;
                    y = dy;
                    maxdistance = Math.max(maxdistance, x * x + y * y);
                }
            }
        }
        
        return maxdistance;
    }
}
