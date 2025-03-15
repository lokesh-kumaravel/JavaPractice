package practice2;

import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(s.nextInt());
        }
        Collections.sort(l);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            System.out.println(l.get(left) + " " + l.get(right) + " ");
            left++;
            right--;
        }
        if (n % 2 != 0) {
            System.out.println(l.get(left));
        }
    }
}
