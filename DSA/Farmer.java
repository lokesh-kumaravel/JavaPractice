package DSA;

import java.util.*;

public class Farmer {
    static long[] dis, edge;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        while (group-- > 0) {
            int n = sc.nextInt();
            long ans = 0;
            dis = new long[n];
            edge = new long[n];
            for (int i = 0; i < n; i++) {
                dis[i] = sc.nextLong();
            }
            Arrays.sort(dis);
            for (int i = 1; i < n; i++) {
                edge[i] = dis[i] - dis[i - 1];
            }
            for (int i = 1; i < n; ++i) {
                ans += edge[i] * (n - i) * (i) - edge[i];
            }
            System.out.println(-ans);
        }
        sc.close();
    }
}
