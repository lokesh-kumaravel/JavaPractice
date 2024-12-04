package LeetCode;

public class CanMakeSubsequence {
    public static void main(String[] args) {
        String str1 = "abcxyz";
        String str2 = "acd";

        int i = 0;
        int j = 0;

        while (i < str1.length() && j < str2.length()) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(j);
            if (ch1 == ch2) {
                i++;
                j++;
                continue;
            }
            if (ch1 == 'z') {
                ch1 = 'a';
            } else {
                ch1++;
            }
            if (ch1 == ch2) {
                ch1++;
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == str2.length()) {
            System.out.println("Can make subsequence: true");
        } else {
            System.out.println("Can make subsequence: false");
        }
    }
}
