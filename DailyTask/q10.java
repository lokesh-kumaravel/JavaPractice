package DailyTask;

import java.util.*;

public class q10 {
    public static void main(String[] args) {
        String str = "a10b1abc5";
        String[] a = str.split("[a-z]");
        String[] b = str.split("[0-9]");
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));
        List<Integer> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        for (String val : a) {
            if (val != "") {
                int ans = Integer.parseInt(val);
                l1.add(ans);
            }
        }
        for (String val : b) {
            if (val != "") {
                l2.add(val);
            }
        }
        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l1.get(i); j++) {
                System.out.println(l2.get(i));
            }
        }
    }
}
