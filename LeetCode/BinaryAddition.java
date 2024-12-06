package LeetCode;

import java.math.BigInteger;

public class BinaryAddition {
    public static void main(String[] args) {
        // Example binary strings
        String a = "1010"; // Binary for 10
        String b = "1101"; // Binary for 13

        BigInteger a1 = new BigInteger(a, 2);
        BigInteger b1 = new BigInteger(b, 2);

        BigInteger res = a1.add(b1);

        String binaryResult = res.toString(2);

        System.out.println("Binary addition result: " + binaryResult); // Output: 10111
    }
}