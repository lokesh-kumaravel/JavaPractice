package DailyTask;

public class q7 {
    public static void main(String[] args) {
        int n = 3;
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        System.out.println("Row Reverse : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("Column Reverse : ");
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            int[] temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
