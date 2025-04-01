package DailyTask;

import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int j = 0;
        int i = a.length - 1;
        while (i > j) {
            if (a[i] % 2 == 0) {
                while (a[j] % 2 == 0) {
                    j++;
                }
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
            i--;
        }
        System.out.println(Arrays.toString(a));
        s.close();
    }
}
