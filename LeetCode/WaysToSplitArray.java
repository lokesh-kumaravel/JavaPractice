package LeetCode;

public class WaysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        long[] ans = new long[nums.length];
        long total = nums[0];
        ans[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ans[i] += ans[i - 1] + nums[i];
            total += nums[i];
        }

        int c = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (ans[i] >= total - ans[i]) {
                c++;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        WaysToSplitArray solution = new WaysToSplitArray();

        int[] nums = { 10, 4, 1, 3, 5, 2 };
        int result = solution.waysToSplitArray(nums);

        System.out.println("Number of ways to split the array: " + result);
    }
}
