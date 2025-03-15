package practice2;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = 0;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            if (c % 2 == 0) {
                sum += rem;
            }
            c++;
            n /= 10;
        }
        System.out.println(sum);
    }
}