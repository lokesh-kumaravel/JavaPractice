package LeetCode;

public class MakeFancyString {
    public static void main(String[] args) {
        String s = "aaabaaaa";
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        char prev = s.charAt(0);
        int freq = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == prev) {
                freq++;
            } else {
                prev = s.charAt(i);
                freq = 1;
            }
            if (freq < 3) {
                str.append(s.charAt(i));
            }
        }

        String result = str.toString();
        System.out.println("Input: " + s);
        System.out.println("Output: " + result);
    }
}
