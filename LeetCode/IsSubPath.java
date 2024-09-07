package LeetCode;
public class IsSubPath {
    // Define the ListNode and TreeNode classes
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Define the isSubPath method directly in the main class
    public static boolean isSubPath(ListNode head, TreeNode root) {
        return dfs(head, head, root);  
    }

    private static boolean dfs(ListNode head, ListNode cur, TreeNode root) {
        if (cur == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (cur.val == root.val) {
            cur = cur.next;
        } else if (head.val == root.val) {
            head = head.next;
        } else {
            cur = head;
        }
        return dfs(head, cur, root.left) || dfs(head, cur, root.right);
    }

    public static void main(String[] args) {
        // Create the linked list: 4 -> 2 -> 8
        ListNode list = new ListNode(4, new ListNode(2, new ListNode(8)));
        
        // Create the binary tree:
        //         1
        //       /   \
        //      4     4
        //     /       \
        //    2         8
        //   /
        //  1
        TreeNode tree = new TreeNode(1,
            new TreeNode(4,
                new TreeNode(2, new TreeNode(1), null),
                null),
            new TreeNode(4, 
                null,
                new TreeNode(8))
        );
        
        // Check if the linked list is a subpath of the binary tree
        boolean result = isSubPath(list, tree);
        
        // Print the result
        System.out.println("Is the linked list a subpath of the binary tree? " + result);
    }
}
