import java.util.*;

public class spiral {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] a = new int[n][m];
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = s.nextInt();
            }
        }
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.println(a[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.println(a[i][right]);
            }
            right--;
            if (top <= bottom && left <= right) {

                for (int i = right; i >= left; i--) {
                    System.out.println(a[bottom][i]);
                }
                bottom--;
                for (int i = bottom; i >= top; i--) {
                    System.out.println(a[i][left]);
                }
                left++;
            }
        }
    }
}
