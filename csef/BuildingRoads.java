// package csef;

import java.util.*;

public class BuildingRoads {
    public static ArrayList<Set<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nodes = s.nextInt();
        for (int i = 0; i < nodes; i++) {
            list.add(new HashSet<>());
        }
        int roads = s.nextInt();
        int[][] a = new int[roads][2];
        for (int i = 0; i < a.length; i++) {
            int src = s.nextInt() - 1;
            int dest = s.nextInt() - 1;
            list.get(src).add(dest);
            list.get(dest).add(src);
        }
        boolean[] visited = new boolean[nodes];
        int c = 0;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nodes; i++) {
            if (!visited[i]) {
                l.add(i + 1);
                c++;
                dfs(i, visited);
                // System.out.println(Arrays.toString(visited));
            }
        }
        System.out.println(c - 1);
        for (int i = 0; i < l.size() - 1; i++) {
            System.out.println(l.get(i) + " " + l.get(i + 1));
        }
    }

    public static void dfs(int node, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : list.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }

}