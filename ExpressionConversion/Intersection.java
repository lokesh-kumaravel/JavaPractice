package ExpressionConversion;

import java.util.HashSet;
import java.util.Set;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Intersection {
    public static void find(Node node1, Node node2) {

        Set<Node> set = new HashSet<>();
        while (node1 != null) {
            set.add(node1);
            node1 = node1.next;
        }
        while (node2 != null) {
            if (set.contains(node2)) {
                System.out.println(node2.data);
                return;
            }
            node2 = node2.next;
        }
    }

    public static void main(String[] args) {

        Node intersection = new Node(10);
        intersection.next = new Node(11);

        Node node1 = new Node(0);
        node1.next = new Node(1);
        node1.next.next = new Node(2);
        node1.next.next.next = intersection;

        Node node2 = new Node(4);
        node2.next = new Node(5);
        node2.next.next = intersection;

        find(node1, node2);
    }
}
