import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MessageRoute {

    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        int nodes = Integer.parseInt(parts[0]);
        int roads = Integer.parseInt(parts[1]);
        for (int i = 0; i < nodes + 1; i++) {
            list.add(new ArrayList<>());
        }
        int[][] a = new int[roads][2];
        for (int i = 0; i < a.length; i++) {
            String[] line = br.readLine().split(" ");
            int src = Integer.parseInt(line[0]);
            int dest = Integer.parseInt(line[1]);
            list.get(src).add(dest);
            list.get(dest).add(src);
        }
        boolean[] visited = new boolean[nodes + 1];
        bfs(nodes, 1, visited);
    }

    public static void bfs(int n, int node, boolean[] visited) {
        int[] parent = new int[n + 1];
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;
        parent[node] = -1;
        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == n) {
                break;
            }
            for (int i = 0; i < list.get(cur).size(); i++) {
                int adj = list.get(cur).get(i);
                if (!visited[adj]) {
                    visited[adj] = true;
                    parent[adj] = cur;
                    q.add(adj);
                }
            }
        }
        if (!visited[n]) {
            System.out.println("IMPOSSIBLE");
        } else {
            StringBuilder sb = new StringBuilder();
            List<Integer> l = new ArrayList<>();
            for (int i = n; i != -1; i = parent[i]) {
                l.add(i);
            }
            System.out.println(l.size());
            for (int i = l.size() - 1; i >= 0; i--) {
                sb.append(l.get(i) + " ");
            }
            System.out.println(sb);
        }
    }
}
