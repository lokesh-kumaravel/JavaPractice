// package csef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BuildingRoads {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        int nodes = Integer.parseInt(parts[0]);
        int roads = Integer.parseInt(parts[1]);
        for (int i = 0; i < nodes; i++) {
            list.add(new ArrayList<>());
        }
        int[][] a = new int[roads][2];
        for (int i = 0; i < a.length; i++) {
            String[] line = br.readLine().split(" ");
            int src = Integer.parseInt(line[0]) - 1;
            int dest = Integer.parseInt(line[1]) - 1;
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
                bfs(i, visited);
                // System.out.println(Arrays.toString(visited));
            }
        }
        System.out.println(c - 1);
        for (int i = 0; i < l.size() - 1; i++) {
            System.out.println(l.get(i) + " " + l.get(i + 1));
        }
    }

    public static void bfs(int node, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;
        while (!q.isEmpty()) {
            int val = q.poll();
            for (int i = 0; i < list.get(val).size(); i++) {
                if (!visited[list.get(val).get(i)]) {
                    visited[list.get(val).get(i)] = true;
                    q.add(list.get(val).get(i));
                }
            }
        }
    }

}