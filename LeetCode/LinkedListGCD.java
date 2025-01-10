package LeetCode;

// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkedListGCD {

    // Function to compute GCD using Euclidean algorithm
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to insert greatest common divisors into the list
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        // Edge case: empty list or single node
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            int gcdValue = gcd(current.val, current.next.val);
            ListNode newNode = new ListNode(gcdValue);

            // Insert newNode after current
            newNode.next = current.next;
            current.next = newNode;

            // Move to the next node after the inserted node
            current = newNode.next;
        }

        return head;
    }

    // Utility function to print the linked list
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main function to test the insertGreatestCommonDivisors function
    public static void main(String[] args) {
        // Creating a linked list: 6 -> 15 -> 10
        ListNode head = new ListNode(6, new ListNode(15, new ListNode(10)));

        System.out.println("Original list:");
        printList(head);

        // Insert greatest common divisors
        head = insertGreatestCommonDivisors(head);

        System.out.println("List after inserting GCDs:");
        printList(head);
    }
}

// class Solution {
// public ListNode insertGreatestCommonDivisors(ListNode head) {
// ListNode current = head;
// int n = 0;
// while(current!=null)
// {
// n++;
// current = current.next;
// }
// int[] a = new int[n];
// int[] gcd = new int[n];
// int index = 0;
// current = head;
// while(current!=null)
// {
// a[index++] = current.val;
// current = current.next;
// }
// index = 0;
// for(int i = 0;i<n-1;i++)
// {
// int val = 0;
// for(int j = 1;j<=a[i]&&j<=a[i+1];j++)
// {
// if(a[i]%j==0&&a[i+1]%j==0)
// {
// val = j;
// }
// }
// gcd[index++] = val;
// }
// current = head;
// index = 0;
// while(current!=null)
// {
// if(index>=n-1)
// {
// break;
// }
// ListNode node = new ListNode(gcd[index]);
// index++;
// ListNode prev = current.next;
// current.next = node;
// node.next = prev;
// current = current.next.next;
// }
// return head;
// }
// }