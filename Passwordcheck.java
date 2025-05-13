import java.util.Scanner;

public class Passwordcheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String password = s.nextLine();

        boolean upper = false;
        boolean lower = false;
        boolean digit = false;
        boolean special = false;

        if (password.length() >= 8) {
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch))
                    upper = true;
                else if (Character.isLowerCase(ch))
                    lower = true;
                else if (Character.isDigit(ch))
                    digit = true;
                else
                    special = true;
            }
        }

        if (password.length() >= 8 && upper && lower && digit && special) {
            System.out.println("Your Password is Strong");
        } else {
            System.out.println("Your Password is Not Strong");
        }
    }
}
