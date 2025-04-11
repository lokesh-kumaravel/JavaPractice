import java.util.*;

public class RoundTrip {
    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        int nodes = 5;
        int roads = 6;
        int n = 3;
        for (int i = 0; i < roads + 1; i++) {
            list.add(new ArrayList<>());
        }
        list.get(1).add(3);
        list.get(3).add(1);
        list.get(1).add(2);
        list.get(2).add(1);
        list.get(5).add(3);
        list.get(3).add(5);
        list.get(1).add(5);
        list.get(5).add(1);
        list.get(2).add(4);
        list.get(4).add(2);
        list.get(4).add(5);
        list.get(5).add(4);
        bfs(1, nodes);
    }

    public static void bfs(int start, int n) {
        List<Integer> l = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        l.add(start);
        boolean[] visited = new boolean[n + 1];
        while (!q.isEmpty()) {
            int val = q.poll();
            System.out.print(val + " ");
            int cur = list.get(val).get(0);
            if (visited[cur]) {
                System.out.println(l);
                return;
            }
            q.add(cur);
            visited[cur] = true;
        }
    }
}