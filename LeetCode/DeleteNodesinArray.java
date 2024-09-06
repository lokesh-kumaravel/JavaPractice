package LeetCode;

import java.util.HashSet;

public class DeleteNodesinArray {

    // Definition for singly-linked list
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Method to modify the linked list
    public static ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Skip nodes at the beginning of the list with values in the set
        while (head != null && set.contains(head.val)) {
            head = head.next;
        }

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            if (set.contains(current.val)) {
                // Skip the current node
                prev.next = current.next;
            } else {
                // Move prev forward only if we are keeping the node
                prev = current;
            }
            // Move current forward in both cases
            current = current.next;
        }

        return head;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode node6 = new ListNode(6);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        // Define the nums array with values to remove
        int[] nums = {6, 2};

        // Call the modifiedList method
        ListNode modifiedHead = modifiedList(nums, head);

        // Print the modified linked list
        printList(modifiedHead);
    }

    // Helper method to print the linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}