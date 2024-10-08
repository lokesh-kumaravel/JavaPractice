package LeetCode;


public class MinSwaps {
    public static void main(String[] args) {
        String s = "[]][]["; 
        int tmp = 0;
        int res = 0;
        for (char a : s.toCharArray()) {
            if (a == ']') {
                tmp++;
            } else {
                tmp--;
            }
            res = Math.max(res, tmp);
        }
        int minSwaps = (res + 1) / 2;
        System.out.println("Minimum swaps for \"" + s + "\": " + minSwaps);
        String[] testCases = {"[]][][", "]]][[[", "[]", "[][[]]"};
        for (String test : testCases) {
            tmp = 0;
            res = 0;
            for (char a : test.toCharArray()) {
                if (a == ']') {
                    tmp++;
                } else {
                    tmp--;
                }
                res = Math.max(res, tmp);
            }
            minSwaps = (res + 1) / 2;
            System.out.println("Minimum swaps for \"" + test + "\": " + minSwaps);
        }
    }
}
