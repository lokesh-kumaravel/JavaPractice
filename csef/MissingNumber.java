
import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int totalSum = sumOfn(n);
        int arraySum = 0;
        for (int i = 0; i < n - 1; i++) {
            arraySum += s.nextInt();
        }
        s.close();
        System.out.println(totalSum - arraySum);
    }

    public static int sumOfn(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
