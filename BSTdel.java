
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

public class BSTdel {
    static Node root;

    public static void display(Node node) {
        if (node == null)
            return;

        display(node.left);
        System.out.print(node.data + " ");
        display(node.right);

    }

    public static void dele(int key) {
        root = delete(root, key);
    }

    public static Node delete(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = delete(root.left, data);
        }
        if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = min(root.right);
            root.right = delete(root.right, data);
        }
        return root;
    }

    public static int min(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.left.data;
            root = root.left;
        }
        return min;
    }

    public static Node insert(Node node, int key) {
        if (node == null)
            return new Node(key);

        if (key < node.data)
            node.left = insert(node.left, key);
        else
            node.right = insert(node.right, key);

        return node;
    }

    public static void main(String[] args) {
        int n, del;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        root = insert(null, sc.nextInt());

        for (int i = 0; i < n - 1; ++i)
            insert(root, sc.nextInt());

        del = sc.nextInt();

        dele(del);

        display(root);
    }
}
