package DSA;

import java.util.*;

public class ConnectedComponents2 {

    public static int countConnectedComponents(int n, List<List<Integer>> adjList) {
        boolean[] visited = new boolean[n];
        int componentCount = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, adjList, visited);
                componentCount++;
            }
        }

        return componentCount;
    }

    private static void dfs(int node, List<List<Integer>> adjList, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited[node] = true;

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();
            for (int neighbor : adjList.get(currentNode)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        int n = 7;
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        adjList.get(0).add(1);
        adjList.get(1).add(0);
        adjList.get(1).add(2);
        adjList.get(2).add(1);

        adjList.get(3).add(4);
        adjList.get(4).add(3);

        adjList.get(5).add(6);
        adjList.get(6).add(5);

        int componentCount = countConnectedComponents(n, adjList);

        System.out.println("Number of connected components: " + componentCount);
    }
}
