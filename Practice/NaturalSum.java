import java.util.*;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = n * (n + 1) / 2;
        System.out.println(result);
    }
}