package ICPC;

import java.util.ArrayList;
import java.util.Scanner;

public class schedule {
    public static int cx = 0;

    public static void generateCombinations(String prefix, int n, int length, ArrayList<String> str) {
        if (length == 0) {
            str.add(prefix);
            cx++;
            return;
        }
        for (int i = 1; i <= n; i++) {
            generateCombinations(prefix + i, n, length - 1, str);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons n: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of weeks w: ");
        int w = sc.nextInt();
        ArrayList<String> str = new ArrayList<>();
        int length = n;
        generateCombinations("", n, length, str);
        System.out.println("Total combinations generated: " + cx);
        int ix = 0;
        while (w > 0) {
            if (ix > str.size() - 1) {
                ix = 0;
            }
            System.out.println(str.get(ix));
            ix++;
            w--;
        }
    }
}