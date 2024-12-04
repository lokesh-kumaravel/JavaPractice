package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class RemoveSolutions {
    public int removeStones(int[][] stones) {
        Set<int[]> visited = new HashSet<>();
        int numOfIslands = 0;
        for (int[] s1 : stones) {
            if (!visited.contains(s1)) {
                dfs(s1, visited, stones);
                numOfIslands++;
            }
        }
        return stones.length - numOfIslands;
    }

    private void dfs(int[] s1, Set<int[]> visited, int[][] stones) {
        visited.add(s1);
        for (int[] s2 : stones) {
            if (!visited.contains(s2)) {
                if (s1[0] == s2[0] || s1[1] == s2[1]) {
                    dfs(s2, visited, stones);
                }
            }
        }
    }

    public static void main(String[] args) {
        RemoveSolutions RemoveStones = new RemoveSolutions();

        // Example 1
        int[][] stones1 = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 } };
        System.out.println("Example 1: " + RemoveStones.removeStones(stones1)); // Expected output: 3

        // Example 2
        int[][] stones2 = { { 0, 0 }, { 0, 2 }, { 1, 1 }, { 2, 2 }, { 1, 2 }, { 2, 1 } };
        System.out.println("Example 2: " + RemoveStones.removeStones(stones2)); // Expected output: 5

        // Example 3
        int[][] stones3 = { { 0, 0 } };
        System.out.println("Example 3: " + RemoveStones.removeStones(stones3)); // Expected output: 0
    }
}
