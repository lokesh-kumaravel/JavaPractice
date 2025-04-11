import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PlanetsQueriesI {
    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        int nodes = Integer.parseInt(parts[0]);
        int queries = Integer.parseInt(parts[1]);
        for (int i = 0; i < nodes + 1; i++) {
            list.add(new ArrayList<>());
        }
        String[] k = br.readLine().split(" ");
        for (int i = 0; i < nodes; i++) {
            list.get(i + 1).add(Integer.parseInt(k[i]));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < queries; i++) {
            String[] line = br.readLine().split(" ");
            int src = Integer.parseInt(line[0]);
            int moves = Integer.parseInt(line[1]);
            int ans = bfs(src, moves);
            sb.append(ans + " ");
        }
        System.out.println(sb);
    }

    public static int bfs(int start, int moves) {
        int current = start;
        for (int i = 0; i < moves; i++) {
            if (list.get(current).isEmpty())
                break;
            current = list.get(current).get(0);
        }
        return current;
    }
}