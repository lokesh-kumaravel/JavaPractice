package DP;

import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        s.nextLine();
        String str = s.nextLine();
        str = str.replace("[", "").replace("]", "");
        String[] ch = str.split(",");
        int[] a = new int[ch.length];
        int n = a.length;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(ch[i]);
        }
        boolean[] ans = new boolean[target + 1];
        ans[0] = true;

        for (int i = 0; i <= target; i++) {
            for (int j = 0; j < n; j++) {
                if (i + a[j] <= target && ans[i]) {
                    ans[i + a[j]] = true;
                }
            }
        }
        System.out.println(ans[target]);
    }
}