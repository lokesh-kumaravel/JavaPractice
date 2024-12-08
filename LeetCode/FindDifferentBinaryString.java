package LeetCode;

import java.util.*;

public class FindDifferentBinaryString {
    public static void main(String[] args) {
        String[] nums = { "000", "001", "010", "011" };
        Set<Integer> set = new HashSet<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            str.append("1");
            set.add(Integer.parseInt(nums[i], 2));
        }
        String string = new String(str);
        int value = Integer.parseInt(string, 2);
        for (int i = 0; i <= value; i++) {
            if (!set.contains(i)) {
                String ans = Integer.toBinaryString(i);

                while (ans.length() < nums.length) {
                    ans = "0" + ans;
                }
                System.out.println("The different binary string is: " + ans);
                return;
            }
        }
        System.out.println("No different binary string found.");
    }
}
