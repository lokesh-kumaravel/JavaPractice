import java.util.*;

public class WordPuzzle {
    public static int c1 = 0;
    public static int count = 0;
    public static char[][] main = {
            { 'A', 'B', 'C', 'I' },
            { 'B', 'I', 'C', 'S' },
            { 'C', 'D', 'E', 'E' }
    };

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        for (int i = 0; i < n; i++) {
            String s1 = s.nextLine();
            char[] m = s1.toCharArray();
            c1 = s1.length();
            int u1 = -1, u2 = -1;
            for (int l = 0; l < 3; l++) {
                for (int g = 0; g < 4; g++) {
                    if (main[l][g] == m[0]) {
                        u1 = l;
                        u2 = g;
                        break;
                    }
                }
                if (u1 != -1 && u2 != -1) {
                    break;
                }
            }
            if (u1 == -1 || u2 == -1) {
                System.out.println("False");
                continue;
            }
            char[][] a = {
                    { 'A', 'B', 'C', 'I' },
                    { 'B', 'I', 'C', 'S' },
                    { 'C', 'D', 'E', 'E' }
            };
            if (find(u1, u2, s1, a, 0, c1)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
        s.close();
    }

    private static boolean find(int i, int j, String s1, char[][] a, int count, int c1) {
        char[] ch = s1.toCharArray();
        if (count == c1) {
            return true;
        }
        if (i >= 0 && i <= 2 && j >= 0 && j <= 3 && a[i][j] == ch[count] && a[i][j] != '1') {
            a[i][j] = '1';
            if (find(i + 1, j, s1, a, count + 1, c1)) {
                return true;
            }
            if (find(i, j + 1, s1, a, count + 1, c1)) {
                return true;
            }
            if (find(i - 1, j, s1, a, count + 1, c1)) {
                return true;
            }
            if (find(i, j - 1, s1, a, count + 1, c1)) {
                return true;
            }
            a[i][j] = main[i][j];
            return false;
        }
        return false;
    }
}