package DailyTask;

public class q6 {
    public static void main(String[] args) {
        int n = 3;
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        int[] n1 = new int[n];
        int[] n2 = new int[n];
        System.out.println("Primary Diagonal : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    n1[i] = a[i][j];
                    System.out.print(a[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Secondary Diagonal : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - i - 1) {
                    n2[i] = a[i][j];
                    System.out.print(a[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Absolute Difference : ");
        for (int i = 0; i < n; i++) {
            System.out.print(Math.abs(n1[i] - n2[i]) + " ");
        }
    }
}
