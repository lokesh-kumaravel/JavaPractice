package Level4.Codeforces;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            // int n = scanner.nextInt();
            String password = scanner.next();
            boolean isValid = true;
            boolean hasDigit = false;
            char prevLetter = 'a' - 1;
            for (char ch : password.toCharArray()) {
                if (Character.isDigit(ch)) {
                    hasDigit = true;
                    int currentDigit = ch - '0';
                    if (currentDigit < prevLetter - 'a' + 1) {
                        isValid = false;
                        break;
                    }
                } else {
                    if (ch < prevLetter) {
                        isValid = false;
                        break;
                    }
                    prevLetter = ch;
                }
            }
            if (hasDigit && isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}