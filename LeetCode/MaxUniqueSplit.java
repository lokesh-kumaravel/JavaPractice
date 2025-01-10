package LeetCode;

import java.util.HashSet;
import java.util.Set;

class find {
    public int maxUniqueSplit(String s) {
        Set<String> set = new HashSet<String>();
        return backtrack(0, s, set);
    }

    private int backtrack(int start, String s, Set<String> set) {
        if (s.length() == start) {
            return 0;
        }
        int maxCount = 0;
        for (int end = start + 1; end <= s.length(); end++) {
            String str = s.substring(start, end);
            if (!set.contains(str)) {
                set.add(str);
                maxCount = Math.max(maxCount, 1 + backtrack(end, s, set));
                set.remove(str);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        find solution = new find();
        String input = "ababccc"; // Example input
        int result = solution.maxUniqueSplit(input);
        System.out.println("Max unique splits: " + result);
    }
}
