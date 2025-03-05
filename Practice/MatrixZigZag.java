import java.util.*;

public class MatrixZigZag {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a[0].length; j++) {
                    System.out.print(a[i][j]);
                }
            } else {
                for (int j = a.length - 1; j >= 0; j--) {
                    System.out.print(a[i][j]);
                }
            }
            System.out.println();
        }
    }
}
