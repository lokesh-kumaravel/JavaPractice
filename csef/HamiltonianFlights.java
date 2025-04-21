import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HamiltonianFlights {
    static List<List<Integer>> list = new ArrayList<>();
    static int c = 0;
    static boolean[] visited;
    static int nodes;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] first = bf.readLine().split(" ");
        nodes = Integer.parseInt(first[0]);
        for (int i = 0; i <= nodes; i++) {
            list.add(new ArrayList<>());
        }
        int m = Integer.parseInt(first[1]);
        for (int i = 0; i < m; i++) {
            String[] lines = bf.readLine().split(" ");
            int a = Integer.parseInt(lines[0]);
            int b = Integer.parseInt(lines[1]);
            list.get(a).add(b);
        }
        visited = new boolean[nodes + 1];
        for (int i = 0; i < list.get(1).size(); i++) {
            int cur = list.get(1).get(i);
            if (!visited[cur]) {
                bfs(cur);
            }
        }
        System.out.println("c : " + c);
    }

    public static boolean bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.println("poll : " + node);
            if (node == nodes) {
                c++;
                return true;
            }
            for (int i = list.get(node).size() - 1; i >= 0; i--) {
                System.out.println(list.get(node).get(i));
                if (!visited[list.get(node).get(i)]) {
                    q.add(list.get(node).get(i));
                    visited[list.get(node).get(i)] = true;
                }
            }
        }
        return false;
    }
}
