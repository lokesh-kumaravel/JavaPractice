package practice2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] a = str.split("\\D+");
        for (int i = 0; i < a.length; i++) {
            int n = Integer.parseInt(a[i]);
            int sum = 0;
            while (n != 0) {
                int rem = n % 10;
                sum = sum * 10 + rem;
                n /= 10;
            }
            System.out.println(sum);
        }
    }
}
