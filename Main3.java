import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = scanner.nextInt();
        }

        char[] ind = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ind[arr[i]] = s.charAt(i);
        }

        String ans = new String(ind);
        System.out.println(ans);
    }
}
