class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTdistance {
    static Node root;

    public static void main(String[] args) {
        int[] a = { 5, 1, 6, 2, 0, 7 };
        for (int i = 0; i < 6; i++) {
            root = insertrec(root, a[i]);
        }
        System.out.println();
        display(root);
        // System.out.println(root.data);
    }

    public static Node display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.println(root.data + " ");
            display(root.right);
        }
        return root;
    }

    public static Node insertrec(Node root, int n) {
        return insert(root, n);
    }

    public static Node insert(Node root, int n) {
        if (root == null) {
            return new Node(n);
        }
        if (n < root.data) {
            root.left = insert(root.left, n);
        }
        if (n > root.data) {
            root.right = insert(root.right, n);
        }
        return root;
    }
}
