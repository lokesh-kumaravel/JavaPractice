package Level4;

import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfTestCases; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 0 || number > 10000) {
                System.out.println("Invalid");
            } else {
                System.out.println(convertToRoman(number));
            }
        }
        scanner.close();
    }
    public static String convertToRoman(int num) {
        if (num == 0) {
            return "";
        }
        String[] thousands = {"", "M", "MM", "MMM", "MMMM", "MMMMM", "MMMMMM", "MMMMMMM", "MMMMMMMM", "MMMMMMMMM", "MMMMMMMMMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        return thousands[num / 1000] + 
               hundreds[(num % 1000) / 100] + 
               tens[(num % 100) / 10] + 
               ones[num % 10];
    }
}