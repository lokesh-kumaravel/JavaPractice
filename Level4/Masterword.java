package Level4;

import java.util.*;

public class Masterword {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        String[] numbers = str.split("\\D+");
        int[] num = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (!numbers[i].isEmpty()) {
                num[i] = Integer.parseInt(numbers[i]);
            }
        }
        char[] a = str.toCharArray();
        int c = 0;
        if ((a[0] >= 'a' && a[0] < 'z') || (a[0] >= 'A' && a[0] <= 'Z')) {
            c++;
        }
        if (a[1] != 'a' && a[1] != 'e' && a[1] != 'i' && a[1] != 'o' && a[1] != 'u' && a[1] != 'A' && a[1] != 'E'
                && a[1] != 'I' && a[1] != 'O' && a[1] != 'U') {
            c++;
        }
        int set = 0, se = 0;
        for (int i = 2; i < a.length; i++) {
            if ((a[i] >= 'a' && a[i] < 'z') || (a[i] >= 'A' && a[i] <= 'Z')) {
                set = i;
                break;
            } else {
                se = 1;
            }
        }
        if (se == 1 && set > 0) {
            if (a[set] == 'A' || a[set] == 'E' || a[set] == 'I' || a[set] == 'O' || a[set] == 'U') {
                c += 2;
            }
        }
        for (int i = set; i < a.length; i++) {
            if (a[i] >= '0' && a[i] <= '9') {
                c++;
                break;
            }
        }
        if (a[a.length - 1] == '[' || a[a.length - 1] == '{' || a[a.length - 1] == ']' || a[a.length - 1] == '}') {
            c++;
        }
        int r1 = num[1] + num[2];
        int r2 = num[1] - num[2];
        if (c == 6) {
            System.out.println("YES " + r1);
        } else {
            System.out.println("NO " + r2);
        }
    }
}