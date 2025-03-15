package practice2;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            rem = rem * rem;
            sum = sum + rem;
            n /= 10;
        }
        System.out.println(sum);
    }
}
