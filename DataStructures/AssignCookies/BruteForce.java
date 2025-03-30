package DataStructures.AssignCookies;

import java.util.*;

public class BruteForce {
    public static void main(String[] args) {
        int[] g = { 3, 2, 1 };
        int[] s = { 1, 1 };
        int result = findContentChildren(g, s);
        System.out.println(result);
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        boolean[] used = new boolean[s.length];
        int count = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (!used[j] && g[i] <= s[j]) {
                    count++;
                    used[j] = true;
                    break;
                }
            }
        }
        return count;
    }
}
