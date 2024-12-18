package DSA;

import java.util.*;

public class DFScycleDetection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int t = s.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < t; i++) {
            int u = s.nextInt();
            int v = s.nextInt();
            list.get(u).add(v);
        }
        s.close();

        boolean[] visited = new boolean[V];

        boolean[] recStack = new boolean[V];

        boolean hasCycle = false;
        for (int i = 0; i < V; i++) {
            if (dfs(list, i, visited, recStack)) {
                hasCycle = true;
                break;
            }
        }

        System.out.println(hasCycle);
    }

    public static boolean dfs(List<List<Integer>> list, int node, boolean[] visited, boolean[] recStack) {
        if (recStack[node]) {
            return true;
        }

        if (visited[node]) {
            return false;
        }

        visited[node] = true;
        recStack[node] = true;

        for (int neighbor : list.get(node)) {
            if (dfs(list, neighbor, visited, recStack)) {
                return true;
            }
        }

        recStack[node] = false;
        return false;
    }
}
/*
 * import java.util.*;
 * public class Main {
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * int nodes = scanner.nextInt();
 * 
 * int edges = scanner.nextInt();
 * 
 * List<List<Integer>> graph = new ArrayList<>();
 * for (int i = 0; i < nodes; i++) {
 * graph.add(new ArrayList<>());
 * }
 * 
 * for (int i = 0; i < edges; i++) {
 * int u = scanner.nextInt();
 * int v = scanner.nextInt();
 * graph.get(u).add(v);
 * }
 * 
 * boolean[] visited = new boolean[nodes];
 * 
 * boolean[] recStack = new boolean[nodes];
 * 
 * boolean hasCycle = false;
 * for (int i = 0; i < nodes; i++) {
 * if (dfs(graph, i, visited, recStack)) {
 * hasCycle = true;
 * break;
 * }
 * }
 * 
 * System.out.println(hasCycle);
 * }
 * 
 * public static boolean dfs(List<List<Integer>> graph, int node, boolean[]
 * visited, boolean[] recStack) {
 * if (recStack[node]) {
 * return true;
 * }
 * 
 * if (visited[node]) {
 * return false;
 * }
 * 
 * visited[node] = true;
 * recStack[node] = true;
 * 
 * for (int neighbor : graph.get(node)) {
 * if (dfs(graph, neighbor, visited, recStack)) {
 * return true;
 * }
 * }
 * 
 * recStack[node] = false;
 * return false;
 * }
 * }
 */