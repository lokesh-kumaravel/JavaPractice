import lokesh.*;
import java.util.*;

// Given an n*n matrix 
// given 2 points 
// move only 2 directions either right and down
// display the number of steps taken to react the destination 
// output -1 if not reached
public class Practice {
    static int c = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int startx = s.nextInt();
        int starty = s.nextInt();
        int endx = s.nextInt();
        int endy = s.nextInt();
        int[][] a = new int[n][n];
        int ans = find(a, n, startx, starty, endx, endy);
        // System.out.println(ans);
    }

    public static int find(int[][] a, int n, int startx, int starty, int endx, int endy) {
        if (startx == endx && starty == endy) {
            c++;
            return c;
        }
        if (startx >= 0 && starty <= n - 1 && startx + 1 < n) {
            find(a, n, startx + 1, starty, endx, endy);
        }
        if (startx >= 0 && starty <= n - 1 && starty < n) {
            find(a, n, startx, starty + 1, endx, endy);
        }
        return 0;
    }
}