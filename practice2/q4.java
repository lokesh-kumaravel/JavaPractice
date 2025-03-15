package practice2;

import java.util.Arrays;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] a = str.split("[a]");
        System.out.println(Arrays.toString(a));

    }
}
