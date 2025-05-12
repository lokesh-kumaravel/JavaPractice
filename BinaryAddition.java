import java.util.*;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String bin1 = s.nextLine();
        String bin2 = s.nextLine();

        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);

        int sum = num1 + num2;

        String ans = Integer.toBinaryString(sum);

        System.out.println(ans);
    }
}
