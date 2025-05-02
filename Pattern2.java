import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String original = s.nextLine();

        int start = s.nextInt();
        int end = s.nextInt();
        s.nextLine();

        String replacement = s.nextLine();

        String result = original.substring(0, start) + replacement + original.substring(end);
        System.out.println(original.substring(0, start));
        System.out.println(original.substring(end));
        System.out.println(result);
    }
}