package DSA;

import java.util.*;

public class TopologicalSort {

    public static List<Integer> topologicalSort(int n, List<List<Integer>> adjList) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        // int c=0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, adjList, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        // System.out.println(c);
        return result;
    }

    private static void dfs(int node, List<List<Integer>> adjList, boolean[] visited, Stack<Integer> stack) {
        visited[node] = true;

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adjList, visited, stack);
            }
        }
        stack.push(node);
    }

    public static void main(String[] args) {

        int n = 6;
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        adjList.get(5).add(2);
        adjList.get(5).add(0);
        adjList.get(4).add(0);
        adjList.get(4).add(1);
        adjList.get(2).add(3);
        adjList.get(3).add(1);

        List<Integer> result = topologicalSort(n, adjList);

        System.out.println("Topological Sort Order: " + result);
    }
}