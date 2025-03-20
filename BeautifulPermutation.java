import java.util.*;

public class BeautifulPermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        StringBuilder sb = new StringBuilder();
        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        } else {
            for (int i = 2; i <= n; i += 2) {
                sb.append(i + " ");
            }
            for (int i = 1; i <= n; i += 2) {
                sb.append(i + " ");
            }
            System.out.println(sb.toString());
        }
    }
}