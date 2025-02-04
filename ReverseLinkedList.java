import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class ReverseLinkedList {
    static Node head;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            insert(s.nextInt());
        }
        reverse(head);
    }

    public static void reverse(Node head) {
        Node prev = null;
        Node cur = head;
        Node next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        display(head);
    }

    public static void display(Node root) {
        Node cur = root;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    public static void insert(int n) {
        Node newnode = new Node(n);
        if (head == null) {
            head = newnode;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newnode;
    }
}