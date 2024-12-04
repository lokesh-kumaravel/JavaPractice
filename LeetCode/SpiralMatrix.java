package LeetCode;

import java.util.*;

public class SpiralMatrix {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i <= 9; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        // Define matrix dimensions
        int m = 3; // number of rows
        int n = 3; // number of columns

        // Generate the spiral matrix
        int[][] matrix = spiralMatrix(m, n, head);

        // Print the matrix
        System.out.println("Spiral Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] a = new int[m][n];
        int top = 0;
        int left = 0;
        int bottom = m - 1;
        int right = n - 1;
        ListNode current = head;

        // Initialize the matrix with -1
        for (int i = 0; i < m; i++) {
            Arrays.fill(a[i], -1);
        }

        // Fill the matrix in spiral order
        while (left <= right && top <= bottom) {
            // Traverse from left to right along the top row
            for (int j = left; j <= right; j++) {
                if (current != null) {
                    a[top][j] = current.val;
                    current = current.next;
                }
            }
            top++;

            // Traverse from top to bottom along the right column
            for (int j = top; j <= bottom; j++) {
                if (current != null) {
                    a[j][right] = current.val;
                    current = current.next;
                }
            }
            right--;

            // Traverse from right to left along the bottom row
            for (int j = right; j >= left; j--) {
                if (current != null) {
                    a[bottom][j] = current.val;
                    current = current.next;
                }
            }
            bottom--;

            // Traverse from bottom to top along the left column
            for (int j = bottom; j >= top; j--) {
                if (current != null) {
                    a[j][left] = current.val;
                    current = current.next;
                }
            }
            left++;
        }

        return a;
    }
}
