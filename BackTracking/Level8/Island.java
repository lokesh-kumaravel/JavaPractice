package Level8;

import java.util.Scanner;

public class Island {

    public static int set = 0;
    public static int count = 1;
    public static int[][] solution = new int[4][5];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] ch = s.next().toCharArray();
        char[] cha = new char[20];
        int k = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0' || ch[i] == '1') {
                cha[k++] = ch[i];
            }
        }
        char[][] a = new char[4][5];
        k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = cha[k++];
            }
        }
        for (int i = 0; i < 4; i++) {
            int r = -1, c = -1;
            for (int j = 0; j < 5; j++) {
                if (a[i][j] == '1') {
                    int set = 0;
                    r = i;
                    c = j;
                }
                find(a, r, c);
                if (set == 1) {
                    set = 0;
                    count++;
                }
            }
        }
        System.out.println(count - 1);
    }

    private static boolean find(char[][] a, int i, int j) {
        if (i >= 0 && i < 4 && j >= 0 && j < 5 && solution[i][j] == 0 && a[i][j] != '0') {
            solution[i][j] = count;
            set = 1;
            if (find(a, i + 1, j)) {
                return true;
            }
            if (find(a, i, j + 1)) {
                return true;
            }
            if (find(a, i - 1, j)) {
                return true;
            }
            if (find(a, i, j - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
