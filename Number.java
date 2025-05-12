import java.util.*;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char result = '0';
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                result = ch;
                break;
            }
        }
        System.out.println(result);
    }
}
