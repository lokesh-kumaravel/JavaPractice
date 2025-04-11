import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class PlanetsCycles {

    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int n = Integer.parseInt(str);
        for (int i = 0; i < n + 1; i++) {
            list.add(new ArrayList<>());
        }
        String[] line = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(line[i]);
            list.get(i + 1).add(val);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int ans = bfs(i, n + 1);
            sb.append(ans + " ");
        }
        System.out.println(sb);
    }

    public static int bfs(int start, int n) {
        int c = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            c++;
            int val = q.poll();
            int cur = list.get(val).get(0);
            if (visited[cur]) {
                return c;
            }
            q.add(cur);
            visited[cur] = true;
        }
        return c;
    }
}
