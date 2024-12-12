package Level4.GameTheory;

import java.util.*;

public class Gradle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] str = s.next().toCharArray();
        ArrayList<Double> a = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '?') {
                a.add(4.5);
            } else {
                int k = Integer.parseInt(str[i] + "");
                a.add((double) k);
            }
        }
        s.close();
        boolean result = find(a, str.length);
        System.out.println(result);
    }

    private static boolean find(ArrayList<Double> a, int n) {
        int k = n / 2;
        double n1 = 0;
        double n2 = 0;
        for (int i = 0; i < k; i++) {
            n1 += a.get(i);
        }
        for (int i = k; i < n; i++) {
            n2 += a.get(i);
        }
        if (n1 == n2) {
            return false;
        } else {
            return true;
        }
    }
}