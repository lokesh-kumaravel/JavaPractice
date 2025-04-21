import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PoliceChase {
    static List<List<Integer>> list = new ArrayList<>();
    static boolean[] visited;
    static int nodes;
    static List<Integer> ans = new ArrayList<>();

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
            list.get(b).add(a);
        }
        visited = new boolean[nodes + 1];
        bfs(1);
        StringBuilder sb = new StringBuilder();
        sb.append(ans.size() + "\n");
        for (int i = 0; i < ans.size(); i++) {
            sb.append(ans.get(i) + " " + nodes + "\n");
        }
        System.out.println(sb);
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int cur = q.poll();
            List<Integer> curlist = list.get(cur);
            if (curlist.contains(nodes)) {
                ans.add(cur);
            }
            for (int i = 0; i < list.get(cur).size(); i++) {
                int val = list.get(cur).get(i);
                if (!visited[val]) {
                    visited[val] = true;
                    q.add(val);
                }
            }
        }

    }
}
