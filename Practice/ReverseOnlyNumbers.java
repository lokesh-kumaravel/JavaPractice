import java.util.Scanner;

public class ReverseOnlyNumbers {
    public static void main(String[] args) {
        String input = "I have 2 apples and 35 mangoes but only 1 banana.";
        Scanner s = new Scanner(System.in);

        String result = reverseNumbersInString(input);
        System.out.println("Modified String: " + result);
    }

    public static String reverseNumbersInString(String str) {
        StringBuilder numbers = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                numbers.append(ch);
            }
        }

        numbers.reverse();

        StringBuilder result = new StringBuilder();
        int numIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                result.append(numbers.charAt(numIndex++));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
