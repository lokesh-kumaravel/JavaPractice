package DataStructures.AssignCookies;

import java.util.Arrays;

public class Greedy {
    public static void main(String[] args) {
        int[] g = { 3, 2, 1 };
        int[] s = { 1, 1 };
        int result = greedymethod(g, s);
        System.out.println(result);
    }

    public static int greedymethod(int[] s, int[] g) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < s.length && j < g.length) {
            if (s[i] <= g[j]) {
                count++;
                i++;
                j++;
            } else if (s[i] > g[j]) {
                j++;
            }
        }
        return count;
    }
}
