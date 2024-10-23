package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class ReplaceValueInTree {
    public TreeNode replaceValueInTree(TreeNode root) {
        if (root == null) return root;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        List<Integer> levelSums = new ArrayList<>();
        while (!q.isEmpty()) {
            int levelSum = 0;
            int levelSize = q.size();
            for (int i = 0; i < levelSize; ++i) {
                TreeNode currentNode = q.poll();
                levelSum += currentNode.val;
                if (currentNode.left != null) q.offer(currentNode.left);
                if (currentNode.right != null) q.offer(currentNode.right);
            }
            levelSums.add(levelSum);
        }
        q.offer(root);
        int levelIndex = 1;
        root.val = 0; 
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();
                int sum = (node.left != null ? node.left.val : 0) + (node.right != null ? node.right.val : 0);
                
                if (node.left != null) {
                    node.left.val = levelSums.get(levelIndex) - sum;
                    q.add(node.left);
                }
                if (node.right != null) {
                    node.right.val = levelSums.get(levelIndex) - sum;
                    q.add(node.right);
                }
            }
            levelIndex++;
        }
        return root;
    }
}
