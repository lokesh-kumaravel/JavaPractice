package LeetCode;

public class SplitLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        // Define k
        int k = 3;

        // Compute the size of the linked list
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        int splitSize = size / k;
        int remaining = size % k;

        // Initialize the result array
        ListNode[] parts = new ListNode[k];
        current = head;
        
        for (int i = 0; i < k; i++) {
            ListNode newPart = current;
            int currentSize = splitSize;
            if (remaining > 0) {
                remaining--;
                currentSize++;
            }

            // Move to the end of the current part
            ListNode prev = null;
            int j = 0;
            while (j < currentSize && current != null) {
                prev = current;
                current = current.next;
                j++;
            }

            // Terminate the current part
            if (prev != null) {
                prev.next = null;
            }

            // Assign the current part to the result array
            parts[i] = newPart;
        }

        // Print each part
        for (int i = 0; i < parts.length; i++) {
            System.out.print("Part " + i + ": ");
            printList(parts[i]);
            System.out.println();
        }
    }

    // Helper method to print a linked list
    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}
