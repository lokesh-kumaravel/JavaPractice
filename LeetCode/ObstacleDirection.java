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
// import java.util.HashSet;
// import java.util.Set;

// class Solution {
//     public int robotSim(int[] commands, int[][] obstacles) {
//         int x=0,y=0,d=0;
//         int[][] direction={{0,1},{1,0},{0,-1},{-1,0}};
//         int maxDistance=0;
//         Set<String> obstacleSet=new HashSet<>();
//         for(int[] obstacle:obstacles){
//             obstacleSet.add(obstacle[0]+","+obstacle[1]);
//         }
//         for(int cmd:commands){
//             if(cmd==-1){
//                 d=(d+1)%4;
//             }else if(cmd==-2){
//                 d=(d+3)%4;
//             }else{
//                 for(int i=0;i<cmd;i++){
//                     int nx=x+direction[d][0];
//                     int ny=y+direction[d][1];
//                     if(obstacleSet.contains(nx+","+ny)){
//                         break;
//                     }
//                     x=nx;
//                     y=ny;
//                     maxDistance=Math.max(maxDistance,x*x+y*y);
//                 }
//             }
//         }
//         return maxDistance;
//     }
// }