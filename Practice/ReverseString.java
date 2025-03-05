import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] a = str.toCharArray();
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            char t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(a));
    }
}
