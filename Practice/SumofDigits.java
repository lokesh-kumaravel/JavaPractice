import java.util.*;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        while (n > 9) {
            int k = n;
            sum = 0;
            while (k != 0) {
                int rem = k % 10;
                sum += rem;
                k /= 10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}
