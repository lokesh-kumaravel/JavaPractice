import java.util.*;

public class nthoccurence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();
        char ch = s.next().charAt(0);
        int n = s.nextInt();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
                if (count == n) {
                    System.out.println(i);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
