package LeetCode;

import java.util.Arrays;

public class countFairPairs {
    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countLess(nums, upper) - countLess(nums, lower - 1);
    }
    public static long countLess(int[] nums, int val) {
        long res = 0;
        for (int i = 0, j = nums.length - 1; i < j; ++i) {
            while (i < j && nums[i] + nums[j] > val) {
                --j;
            }
            res += j - i;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        int lower = 4;
        int upper = 8;
        System.out.println(countFairPairs(nums, lower, upper));
        nums = new int[]{1, 2, 3, 4, 5};
        lower = 5;
        upper = 7;
        System.out.println(countFairPairs(nums, lower, upper));
        nums = new int[]{-1, 0, 1};
        lower = 0;
        upper = 2;
        System.out.println(countFairPairs(nums, lower, upper)); 
    }
}