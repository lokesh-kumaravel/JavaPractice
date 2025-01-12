package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lexicalOrder {
    public static void main(String[] args) {
        int n = 13;
        List<Integer> list = new ArrayList<Integer>();
        String[] a = new String[n];

        for (int i = 1; i <= n; i++) {
            a[i - 1] = Integer.toString(i);
        }

        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(a[i]));
        }

        System.out.println(list); // Output: [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
