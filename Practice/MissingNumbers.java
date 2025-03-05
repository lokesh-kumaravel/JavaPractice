import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int k = a[n - 1] - a[0] + 1;
        System.out.println(k - n);
    }
}
