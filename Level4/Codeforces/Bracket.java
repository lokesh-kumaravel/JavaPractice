package Level4.Codeforces;

import java.util.Scanner;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String s = scanner.nextLine();
            int count = countValidPairs(s);
            System.out.println(count);
        }
        scanner.close();
    }

    private static int countValidPairs(String s) {
        int n = s.length();
        int count = 0;
        for (int l = 0; l < n; l++) {
            for (int r = l + 1; r <= n; r++) {
                String substring = s.substring(l, r);
                if (isValidBracketSequence(substring)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isValidBracketSequence(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                balance++;
            } else {
                balance--;
                if (balance < 0) {
                    return false;
                }
            }
        }
        return balance == 0;
    }
}
