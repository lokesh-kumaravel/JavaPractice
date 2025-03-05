import java.util.Scanner;

public class ReverseStringRecursively {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "HelloWorld";
        str = reverseString(str, str.length() - 1);
        System.out.println(str);
    }

    public static String reverseString(String str, int index) {
        if (index < 0) {
            return "";
        }
        return str.charAt(index) + reverseString(str, index - 1);
    }
}
