import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String t = str.substring(i, j);
                if (t.length() > 1) {
                    if (find(t)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static boolean find(String t) {
        int l = 0;
        int r = t.length() - 1;
        while (l <= r) {
            if (t.charAt(l) != t.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
