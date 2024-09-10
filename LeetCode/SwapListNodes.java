package LeetCode;

public class SwapListNodes {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode newnode = new ListNode(0);
            newnode.next = head;
            ListNode current = newnode;
            while (current.next != null && current.next.next != null) {
                ListNode first = current.next;
                ListNode second = current.next.next;
                current.next = second;
                first.next = second.next;
                second.next = first;
                current = current.next.next;
            }
            return newnode.next;
        }
    }

    // Helper method to print linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        // Print the original list
        System.out.print("Original list: ");
        printList(head);

        // Swap pairs
        Solution solution = new Solution();
        ListNode swappedHead = solution.swapPairs(head);

        // Print the swapped list
        System.out.print("Swapped list: ");
        printList(swappedHead);
    }
}
