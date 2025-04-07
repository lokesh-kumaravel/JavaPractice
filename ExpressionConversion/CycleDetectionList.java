package ExpressionConversion;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CycleDetectionList {

    static Node head = null;

    public static void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new Node(data);
    }

    public static void print() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    public static boolean cycleDetection() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        print();
        System.out.println();
        boolean ans = cycleDetection();
        System.out.println(ans);
        head.next = head;
        boolean ans1 = cycleDetection();
        System.out.println(ans1);
    }
}
