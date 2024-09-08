package LeetCode;

public class RemoveDuplicatesLL {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Method to delete duplicates from a sorted linked list
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to demonstrate the deletion of duplicates
    public static void main(String[] args) {
        // Creating a sorted linked list with duplicates: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));

        System.out.println("Original list:");
        printList(head);

        // Removing duplicates
        head = deleteDuplicates(head);

        System.out.println("List after removing duplicates:");
        printList(head);
    }
}
