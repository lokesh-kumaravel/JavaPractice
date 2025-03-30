package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Insert {
    public static void main(String[] args) {
        int[][] interval = { { 1, 3 }, { 6, 9 } };
        int[] newInterval = { 2, 5 };
        int[][] ans = find(interval, newInterval);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }

    public static int[][] find(int[][] interval, int[] newInterval) {
        int[][] a = Arrays.copyOf(interval, interval.length + 1);
        a[interval.length] = new int[2];
        a[interval.length][0] = newInterval[0];
        a[interval.length][1] = newInterval[1];
        Arrays.sort(a, (x, y) -> x[0] - y[0]);
        List<int[]> list = new ArrayList<>();
        int i = 0;
        while (i < a.length) {
            int start = a[i][0];
            int curmin = a[i][1];
            while (i < a.length - 1 && curmin >= a[i + 1][0]) {
                curmin = Math.max(curmin, a[i + 1][1]);
                i++;
            }
            list.add(new int[] { start, curmin });
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }
}
