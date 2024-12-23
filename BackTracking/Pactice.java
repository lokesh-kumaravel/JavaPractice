public class Pactice {

    public static int a[][] = {
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 }
    };
    public static int main[][] = {
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0 }
    };

    public static void main(String[] args) {
        int n = 1;
        int m = 3;
        int k = 1;
        int l = 4;
        find(n, m, k, l, count);
        System.out.println(mincount);
    }

    public static int count = 0;
    public static int mincount = 100;

    private static boolean find(int i, int j, int k, int l, int count) {
        if (i == k - 1 && j == l - 1) {
            if (mincount > count) {
                mincount = count;
            }
            for (int r = 0; r < 5; r++) {
                for (int u = 0; u < 6; u++) {
                    System.out.print(main[r][u] + " ");
                }
                System.out.println();
            }
            System.out.println(count);
            return true;
        }
        if (i >= 0 && i < 5 && j >= 0 && j < 6 && main[i][j] != 1) {
            main[i][j] = 1;
            if (find(i + 1, j + 2, k, l, count + 1)) {
                return true;
            }
            if (find(i + 1, j - 2, k, l, count + 1)) {
                return true;
            }
            if (find(i - 1, j + 2, k, l, count + 1)) {
                return true;
            }
            if (find(i - 1, j - 2, k, l, count + 1)) {
                return true;
            }
            if (find(i + 2, j - 1, k, l, count + 1)) {
                return true;
            }
            if (find(i + 2, j + 1, k, l, count + 1)) {
                return true;
            }
            if (find(i - 2, j - 1, k, l, count + 1)) {
                return true;
            }
            if (find(i - 2, j + 1, k, l, count + 1)) {
                return true;
            }
            main[i][j] = 0;
            return false;
        }
        return false;
    }
}