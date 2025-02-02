package lokesh;

import java.util.*;

public class StringOperations {
    String s1 = "Hello Get world Get";

    public static void main(String[] args) {
        // String s2 = "Hello Get {jfsf} Get";

        // int count = 0;
        // int caps = 0;
        // for (char ch : s1.toCharArray()) {
        // if (ch >= 'A' && ch <= 'Z') {
        // caps++;
        // }
        // }
        // count += caps;
        // System.out.println();
        // System.out.println(count);
        // String[] str = s1.split(" ");
        // int c = 0;
        // for (int i = 0; i < str.length; i++) {
        // if (str[i].equals("GET")) {
        // c++;
        // } else if (str[i].equals("Get")) {
        // c++;
        // }
        // if (c == 2) {
        // str[i] = "";
        // break;
        // }
        // }
        // System.out.println(c);
        // if (c == 2) {
        // count += s1.length() - 3;
        // }
        // String t1 = "";
        // for (String val : str) {
        // t1 += val + " ";
        // }
        // System.out.println(t1);
        // System.out.println(count);
        // if (isPrime(t1.length())) {

        // }
    }

    public static boolean isPrime(int n) {
        int c = 0;
        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        }
        return false;
    }

}
