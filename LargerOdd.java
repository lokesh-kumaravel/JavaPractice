import java.util.Scanner;

public class LargerOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String num = s.nextLine();

        String result = "Odd Number doesn't exist";

        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 == 1) {
                result = num.substring(0, i + 1);
                break;
            }
        }

        System.out.println(result);

    }
}
