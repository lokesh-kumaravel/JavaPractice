package LeetCode;
import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int le = j + 1;
                int ri = nums.length - 1;
                while (le < ri) {
                    long l = (long) nums[i] + nums[j] + nums[le] + nums[ri];
                    if (l == target) {
                        ArrayList<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[le]);
                        arr.add(nums[ri]);
                        if (!list.contains(arr)) {
                            list.add(arr);
                        }
                        le++;
                        ri--;
                    } else if (l < target) {
                        le++;
                    } else {
                        ri--;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        var solution = new FourSum();

        // Test case 1
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        List<List<Integer>> result1 = solution.fourSum(nums1, target1);
        System.out.println("Test case 1 result: " + result1);

        // Test case 2
        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;
        List<List<Integer>> result2 = solution.fourSum(nums2, target2);
        System.out.println("Test case 2 result: " + result2);

        // Test case 3
        int[] nums3 = {0, 0, 0, 0};
        int target3 = 0;
        List<List<Integer>> result3 = solution.fourSum(nums3, target3);
        System.out.println("Test case 3 result: " + result3);

        // Test case 4
        int[] nums4 = {1, 2, 3, 4, 5};
        int target4 = 10;
        List<List<Integer>> result4 = solution.fourSum(nums4, target4);
        System.out.println("Test case 4 result: " + result4);

        // Test case 5
        int[] nums5 = {-1, 0, 1, 2, -1, -4};
        int target5 = -1;
        List<List<Integer>> result5 = solution.fourSum(nums5, target5);
        System.out.println("Test case 5 result: " + result5);
    }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countSubIslands'");
    }
}
