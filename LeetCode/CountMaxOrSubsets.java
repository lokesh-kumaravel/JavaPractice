package LeetCode;

public class CountMaxOrSubsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int maxOrValue = 0;
        for (int num : nums) {
            maxOrValue |= num;
        }
        int count = countMaxOrSubsets(nums, maxOrValue, 0, 0);
        System.out.println("Number of subsets with max OR value: " + count);
    }

    private static int countMaxOrSubsets(int[] nums, int maxOrValue, int index, int currentOr) {
        int count = 0;
        if (currentOr == maxOrValue) {
            count++;
        }
        for (int i = index; i < nums.length; i++) {
            count += countMaxOrSubsets(nums, maxOrValue, i + 1, currentOr | nums[i]);
        }

        return count;
    }
}
