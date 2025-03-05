import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            ans = ans * 10 + rem;
            n /= 10;
        }
        System.out.println(ans);
    }
}
