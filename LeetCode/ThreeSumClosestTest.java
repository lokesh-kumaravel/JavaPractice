package LeetCode;
import java.util.Arrays;

public class ThreeSumClosestTest {
    
    // Solution class with the threeSumClosest method
    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int res = 0;
            int n = nums.length;
            int gap = Integer.MAX_VALUE;
            for (int i = 0; i < n - 2; i++) {
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum < target) {
                        int currentGap = target - sum;
                        if (currentGap < gap) {
                            gap = currentGap;
                            res = sum;
                        }
                        j++;
                    } else if (sum > target) {
                        int currentGap = sum - target;
                        if (currentGap < gap) {
                            gap = currentGap;
                            res = sum;
                        }
                        k--;
                    } else {
                        return sum;
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
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        int result1 = solution.threeSumClosest(nums1, target1);
        System.out.println("Test case 1 result: " + result1);
        
        // Test case 2
        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        int result2 = solution.threeSumClosest(nums2, target2);
        System.out.println("Test case 2 result: " + result2);
        
        // Test case 3
        int[] nums3 = {1, 1, 1, 1};
        int target3 = 2;
        int result3 = solution.threeSumClosest(nums3, target3);
        System.out.println("Test case 3 result: " + result3);
        
        // Test case 4
        int[] nums4 = {1, 2, 3, 4, 5};
        int target4 = 10;
        int result4 = solution.threeSumClosest(nums4, target4);
        System.out.println("Test case 4 result: " + result4);
        
        // Test case 5
        int[] nums5 = {-1, 0, 1, 1};
        int target5 = 0;
        int result5 = solution.threeSumClosest(nums5, target5);
        System.out.println("Test case 5 result: " + result5);
    }
}
