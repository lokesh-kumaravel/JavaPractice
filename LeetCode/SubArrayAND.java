package LeetCode;
public class SubArrayAND {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 2, 2, 3, 3, 3, 1}; 
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        int length = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                count++;
                length = Math.max(count, length);
            } else {
                count = 0;
            }
        }

        System.out.println("Length of the longest subarray of maximum elements: " + length);
    }
}
