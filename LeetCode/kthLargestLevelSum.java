package LeetCode;

import java.util.*;

public class kthLargestLevelSum {
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                        new TreeNode(2,
                            new TreeNode(4),
                            new TreeNode(5)),
                        new TreeNode(3,
                            null,
                            new TreeNode(6)));

        kthLargestLevelSum solution = new kthLargestLevelSum();
        int k = 2; 
        long result = solution.kthLargestLevelSum(root, k);
        System.out.println("The " + k + "th largest level sum is: " + result);
    }

    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                sum += node.val;
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            res.add(sum);
        }

        if (k > res.size()) {
            return -1;
        }
        res.sort(Collections.reverseOrder());
        return res.get(k - 1);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    
    TreeNode(int val) { 
        this.val = val; 
    }
    
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
