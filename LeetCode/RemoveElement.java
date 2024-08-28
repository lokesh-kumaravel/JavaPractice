package LeetCode;
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 3, 5};
        int val = 3;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        // Print the results
        System.out.println("New length after removing elements: " + index);
        System.out.print("Array elements after removal: ");
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
