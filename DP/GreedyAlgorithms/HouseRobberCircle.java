package DP.GreedyAlgorithms;
import java.util.Scanner;
public class HouseRobberCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int n = 0;
        char[] str = a.toCharArray();
        for(int i = 0;i<str.length;i++)
        {
            if(str[i]==',')
            {
                n++;
            }
        }
        n++;
        String[] arr = a.split(",");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        int result = rob(nums);
        System.out.println(result);
    }
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int max1 = robLinear(nums, 0, nums.length - 2);
        int max2 = robLinear(nums, 1, nums.length - 1);
        return Math.max(max1, max2);
    }
    private static int robLinear(int[] nums, int start, int end) {
        int prev2 = 0;
        int prev1 = 0;
        for (int i = start; i <= end; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}