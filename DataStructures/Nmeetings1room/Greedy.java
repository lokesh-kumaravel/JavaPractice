package DataStructures.Nmeetings1room;

import java.util.*;

public class Greedy {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        int[][] a = new int[start.length][2];
        for (int i = 0; i < a.length; i++) {
            a[i][0] = start[i];
            a[i][1] = end[i];
        }
        Arrays.sort(a, (x, y) -> Integer.compare(x[1], y[1]));
        int result = find(a);
        System.out.println(result);
    }

    public static int find(int[][] a) {
        int count = 0;
        int last_end = -1;
        for (int i = 0; i < a.length; i++) {
            if (last_end < a[i][0]) {
                count++;
                last_end = a[i][1];
            }
        }
        return count;
    }
}
