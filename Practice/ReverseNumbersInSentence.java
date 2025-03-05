import java.util.Scanner;

public class ReverseNumbersInSentence {
    public static void main(String[] args) {
        String sentence = "I have 2 apples and 35 mangoes but only 1 banana.11";
        Scanner s = new Scanner(System.in);

        String ans = find(sentence);

        System.out.println("Reversed Numbers: " + ans);
    }

    public static String find(String str) {
        StringBuilder numbers = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                numbers.append(ch);
            } else {
                if (numbers.length() > 0) {
                    result.insert(0, numbers + " ");
                    numbers.setLength(0);
                }
            }
        }
        if (numbers.length() > 0) {
            result.insert(0, numbers + " ");
        }

        return result.toString().trim();
    }
}
