package Level4;

import java.util.*;

public class LetterValue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] a = s.next().toCharArray();
        char[] b = s.next().toCharArray();
        char[] c = s.next().toCharArray();
        s.close();
        int a1 = 0;
        for (int i = 0; i < a.length; i++) {
            int k = a[i] - 'a';
            a1 = a1 * 10 + k;
        }
        int a2 = 0;
        for (int i = 0; i < b.length; i++) {
            int k = b[i] - 'a';
            a2 = a2 * 10 + k;
        }
        int a3 = 0;
        for (int i = 0; i < c.length; i++) {
            int k = c[i] - 'a';
            a3 = a3 * 10 + k;
        }
        int r1 = a1 + a2;
        if (r1 == a3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}