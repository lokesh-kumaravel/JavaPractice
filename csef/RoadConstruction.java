import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoadConstruction {
    static int[] parent;
    static int[] size;
    static int connectedComponents;
    static int max = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().split(" ");
        int nodes = Integer.parseInt(parts[0]);
        int days = Integer.parseInt(parts[1]);

        parent = new int[nodes];
        size = new int[nodes];
        for (int i = 0; i < nodes; i++) {
            parent[i] = i;
            size[i] = 1;
        }
        connectedComponents = nodes;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < days; i++) {
            String[] line = br.readLine().split(" ");
            int src = Integer.parseInt(line[0]) - 1;
            int dest = Integer.parseInt(line[1]) - 1;
            union(src, dest);
            sb.append(connectedComponents + " " + max + "\n");
        }
        System.out.println(sb);
    }

    public static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public static void union(int x, int y) {
        int a = find(x);
        int b = find(y);
        if (a == b) {
            return;
        }
        if (size[a] > size[b]) {
            parent[b] = a;
            size[a] += size[b];
            max = Math.max(size[a], max);
        } else {
            parent[a] = b;
            size[b] += size[a];
            max = Math.max(size[b], max);
        }
        connectedComponents--;
    }
}