package LeetCode;

public class LongestDiverseString {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 7;
        String result = longestDiverseString(a, b, c);
        System.out.println(result);
    }

    public static String longestDiverseString(int a, int b, int c) {
        int size = a + b + c;
        int Acount = 0;
        int Bcount = 0;
        int Ccount = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if ((a >= b && a >= c && Acount < 2) || (Bcount == 2 && a > 0) || (Ccount == 2 && a > 0)) {
                sb.append("a");
                a -= 1;
                Acount += 1;
                Bcount = 0;
                Ccount = 0;
            } else if ((b >= a && b >= c && Bcount < 2) || (Acount == 2 && b > 0) || (Ccount == 2 && b > 0)) {
                sb.append("b");
                b -= 1;
                Bcount += 1;
                Acount = 0;
                Ccount = 0;
            } else if ((c >= a && c >= b && Ccount < 2) || (Acount == 2 && c > 0) || (Bcount == 2 && c > 0)) {
                sb.append("c");
                c -= 1;
                Ccount += 1;
                Acount = 0;
                Bcount = 0;
            }
        }
        return sb.toString();
    }
}
