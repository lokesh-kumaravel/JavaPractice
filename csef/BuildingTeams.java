import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BuildingTeams {
    static List<List<Integer>> list = new ArrayList<>();
    static int[] teams;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int nodes = Integer.parseInt(str[0]);
        int vertices = Integer.parseInt(str[1]);
        for (int i = 0; i <= nodes; i++) {
            list.add(new ArrayList<>());
        }
        teams = new int[nodes + 1];
        for (int i = 0; i < vertices; i++) {
            String[] line = bf.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            list.get(a).add(b);
            list.get(b).add(a);
        }
        for (int i = 1; i <= nodes; i++) {
            if (teams[i] == 0) {
                if (!bfs(i)) {
                    System.out.println("IMPOSSIBLE");
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= nodes; i++) {
            sb.append(teams[i] + " ");
        }
        System.out.println(sb);
    }

    public static boolean bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        teams[start] = 1;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int i = 0; i < list.get(node).size(); i++) {
                if (teams[list.get(node).get(i)] == 0) {
                    teams[list.get(node).get(i)] = 3 - teams[node];
                    q.add(list.get(node).get(i));
                } else if (teams[node] == teams[list.get(node).get(i)]) {
                    return false;
                }
            }
        }
        return true;
    }
}
