import java.util.*;

public class Stringopp {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int alpha = 0;
        int spl = 0;
        String[] k = str.split(" ");
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] <= 9) {
                a[i] = '@';
            } else if (a[i] >= 'a' && a[i] <= 'z') {
                alpha++;
                a[i] = ' ';
            } else if (a[i] >= 'A' && a[i] <= 'Z') {
                alpha++;
                a[i] = 'A';
            } else if (a[i] != ' ') {
                System.out.println("spl : " + a[i]);
                spl++;
            }
        }
        System.out.println(new String(a));
        System.out.println("No of words : " + k.length);
        System.out.println("No of special aplhabets : " + alpha);
        System.out.println("No of special char : " + spl);
    }
}