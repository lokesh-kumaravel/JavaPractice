package DailyTask;

import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss = s.nextLine();
        String[] a = ss.split(" ");
        Arrays.sort(a);
        for (String str : a) {
            System.out.print(str + " ");
        }
        s.close();
    }
}