package DailyTask;

import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss = s.nextLine();
        String[] a = ss.split(" ");
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            String t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
        for (String str : a) {
            System.out.print(str + " ");
        }
        s.close();
    }
}
