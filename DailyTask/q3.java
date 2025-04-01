package DailyTask;

import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            if (a[r] == 1) {
                while (a[l] != 0) {
                    l++;
                }
                int t = a[r];
                a[r] = a[l];
                a[l] = t;
                l++;
            }
            r--;
        }
        System.out.println(Arrays.toString(a));
        s.close();
    }
}
