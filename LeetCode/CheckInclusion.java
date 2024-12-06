package LeetCode;

import java.util.*;

public class CheckInclusion {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "oidbcaf";

        if (s1.length() > s2.length()) {
            System.out.println(false);
            return;
        }

        int[] a = new int[26];
        int[] b = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(a, b)) {
            System.out.println(true);
            return;
        }

        int start = 0;
        int end = s1.length();
        while (end < s2.length()) {
            b[s2.charAt(start) - 'a']--;
            b[s2.charAt(end) - 'a']++;
            if (Arrays.equals(a, b)) {
                System.out.println(true);
                return;
            }
            start++;
            end++;
        }
        System.out.println(false);
    }
}
