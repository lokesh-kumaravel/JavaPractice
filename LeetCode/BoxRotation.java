package LeetCode;

import java.util.*;

public class BoxRotation {
    public static void main(String[] args) {
        // char[][] box = { { '#', '.', '*', '#' } };
        // char[][] box = { { '#', '.', '*', '.' }, { '#', '#', '*', '.' } };
        char[][] box = {
                { '#', '#', '*', '.', '*', '.' },
                { '#', '#', '#', '*', '.', '.' },
                { '#', '#', '#', '.', '#', '.' }
        };
        // char[][] box = { { '#', '#', '#', '.', '#', '.' } };
        int row = box.length;
        int col = box[0].length;
        System.out.println("This is the row and column size : " + row + " " + col);
        int[][] ans = new int[col][row];
        int m = 0;
        for (int i = box.length - 1; i >= 0; i--) {
            char[] a = find(box[i]);
            for (int j = 0; j < col; j++) {
                ans[j][m] = a[j];
                System.out.println((char) ans[j][m] + " ");
            }
            m++;
            System.out.println();
        }
        // for (char[] a : box) {
        // a = find(a);
        // System.out.println(Arrays.toString(a));
        // }
    }

    public static char[] find(char[] a) {
        for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = i + 1; j < a.length && a[i] != '.' && a[j] != '*' && a[i] != '*'; j++) {
                if (a[j] == '.') {
                    index = j;
                }
            }
            if (index != i) {
                a[i] = '.';
                a[index] = '#';
            }
        }
        return a;
        // System.out.println(Arrays.toString(a));
    }
}