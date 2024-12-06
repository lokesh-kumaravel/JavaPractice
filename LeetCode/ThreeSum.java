package LeetCode;

import java.util.*;

public class ThreeSum {

    // Solution class with the threeSum method
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    int total = nums[i] + nums[j] + nums[k];
                    if (total < 0) {
                        j++;
                    } else if (total > 0) {
                        k--;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;
                        while (j < k && nums[j] == nums[j - 1]) {
                            j++;
                        }
                    }
                }
            }
            return res;
        }
    }

    // Main method to test the Solution class
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] nums1 = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result1 = solution.threeSum(nums1);
        System.out.println("Test case 1 result: " + result1);

        // Test case 2
        int[] nums2 = { 0, 0, 0, 0 };
        List<List<Integer>> result2 = solution.threeSum(nums2);
        System.out.println("Test case 2 result: " + result2);

        // Test case 3
        int[] nums3 = { 1, 2, -2, -1 };
        List<List<Integer>> result3 = solution.threeSum(nums3);
        System.out.println("Test case 3 result: " + result3);

        // Test case 4
        int[] nums4 = { -1, 1, 0 };
        List<List<Integer>> result4 = solution.threeSum(nums4);
        System.out.println("Test case 4 result: " + result4);
    }
}
