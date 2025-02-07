package TimeComplexity;

public class Practice {
    public static void main(String[] ags) {
        int n = 500000 / 2;
        int count = 0;
        while (n > 0) {
            n /= 2;
            System.out.println(n);
            count += n;
        }
        System.out.println("++++++++++");
        System.out.println(count);
    }
}
