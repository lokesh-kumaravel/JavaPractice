package practice2;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] a = s.next().toCharArray();
        for (int i = 0; i < a.length - 1; i += 2) {
            char ch = a[i];
            a[i] = a[i + 1];
            a[i + 1] = ch;
        }
        System.out.println(new String(a));
    }
}
