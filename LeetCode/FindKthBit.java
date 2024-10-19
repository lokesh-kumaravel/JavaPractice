package LeetCode;

import java.util.Scanner;

public class FindKthBit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        Solution solution = new Solution();
        char result = solution.findKthBit(n, k);
        System.out.println("The " + k + "-th bit in the " + n + "-th binary string is: " + result);
        scanner.close();
    }
}

class Solution {
    public char findKthBit(int n, int k) {
        if (n == 1) return '0';
        int length = (1 << n) - 1;
        int mid = length / 2 + 1;
        if (k == mid) return '1';
        if (k < mid) return findKthBit(n - 1, k);
        return findKthBit(n - 1, length - k + 1) == '0' ? '1' : '0';
    }
}