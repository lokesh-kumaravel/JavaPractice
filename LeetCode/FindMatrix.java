package LeetCode;

import java.util.*;

public class FindMatrix {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1, 2, 3, 4}; // Example input

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        int set;

        for (int i = 0; i < nums.length; i++) {
            set = 0;
            for (int j = 0; j < ans.size(); j++) {
                if (!ans.get(j).contains(nums[i])) {
                    ans.get(j).add(nums[i]);
                    set = 1;
                    break;
                }
            }
            if (set == 0) {
                ans.add(new ArrayList<>());
                ans.get(ans.size() - 1).add(nums[i]);
            }
        }

        // Print the result
        System.out.println(ans);
    }
}
