package LeetCode;

public class MinOperations {
    public static void main(String[] args) {
        class Solution {
            public int[] minOperations(String boxe) {
                int[] ans = new int[boxe.length()];
                char[] boxes = boxe.toCharArray();
                for (int i = 0; i < boxes.length; i++) {
                    int sum = 0;
                    for (int j = 0; j < boxes.length; j++) {
                        if (i == j) {
                            continue;
                        }
                        if (boxes[j] == '1' && i > j) {
                            sum += i - j;
                        } else if (boxes[j] == '1' && i < j) {
                            sum += j - i;
                        }
                    }
                    ans[i] = sum;
                }
                return ans;
            }
        }

        Solution solution = new Solution();
        String boxe = "110";
        int[] result = solution.minOperations(boxe);
        for (int ops : result) {
            System.out.print(ops + " ");
        }
        // Output: 1 1 0
    }
}
