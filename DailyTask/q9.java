package DailyTask;

import java.util.*;

public class q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss = s.nextLine();
        ss = ss.replaceAll("[aeiou]", " ");
        ss = ss.replace("  ", " ");
        String[] a = ss.split(" ");
        for (String val : a) {
            if (!val.equals(" ")) {
                System.out.println(val);
            }
        }
        s.close();
    }
}
