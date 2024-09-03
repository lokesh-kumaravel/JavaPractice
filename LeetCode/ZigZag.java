package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ZigZag {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows)); // Output: "PAHNAPLSIIGYIR"

        s = "PAYPALISHIRING";
        numRows = 4;
        System.out.println(convert(s, numRows)); // Output: "PINALSIGYAHRPI"

        s = "A";
        numRows = 1;
        System.out.println(convert(s, numRows)); // Output: "A"
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int idx = 0, d = 1;
        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }

        for (char c : s.toCharArray()) {
            rows[idx].add(c);
            if (idx == 0) {
                d = 1;
            } else if (idx == numRows - 1) {
                d = -1;
            }
            idx += d;
        }

        StringBuilder result = new StringBuilder();
        for (List<Character> row : rows) {
            for (char c : row) {
                result.append(c);
            }
        }

        return result.toString();        
    }
}
