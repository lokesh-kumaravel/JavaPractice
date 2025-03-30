package DataStructures.AssignCookies;

import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        int[] g = { 3, 2, 1 };
        int[] s = { 1, 1 };
        Arrays.sort(g);
        Arrays.sort(s);
        int result = backtrack(g, s, 0, 0);
        System.out.println(result);
    }

    public static int backtrack(int[] g, int[] s, int child, int cookie) {
        if (child >= g.length || cookie >= s.length) {
            return 0;
        }
        int assign = 0;
        if (s[cookie] >= g[child]) {
            assign = 1 + backtrack(g, s, child + 1, cookie + 1);
        }
        int skip = backtrack(g, s, child, cookie + 1);
        return Math.max(assign, skip);
    }
}
