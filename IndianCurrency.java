import java.util.*;

public class IndianCurrency {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            find(s.nextInt());
            System.out.println();
        }
    }

    public static void find(int n) {
        int[] a = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };
        for (int i = a.length - 1; i >= 0; i--) {
            while (n >= a[i]) {
                System.out.print(a[i] + " ");
                n -= a[i];
            }
        }
    }
}