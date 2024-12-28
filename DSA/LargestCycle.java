package DSA;

import java.util.*;

public class LargestCycle {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int v = s.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < v; i++) {
            int n1 = s.nextInt() - 1;
            int n2 = s.nextInt() - 1;
            list.get(n1).add(n2);
            list.get(n2).add(n1);
        }
        s.close();
        System.out.println(DFS(n) + 1);
    }

    private static int DFS(int n) {
        int max = 0;
        boolean[] visited = new boolean[n];
        int[] dist = new int[n];
        int[] parent = new int[n];
        Arrays.fill(parent, -1);
        for (int i = 0; i < n; i++) {
            dist[i] = 0;
            Stack<Integer> stack = new Stack<>();
            stack.push(i);
            while (!stack.isEmpty()) {
                int k = stack.pop();
                visited[k] = true;
                for (int neighbour : list.get(k)) {
                    if (!visited[neighbour]) {
                        dist[neighbour] = dist[k] + 1;
                        stack.add(neighbour);
                        parent[neighbour] = k;
                    } else
                    // if(parent[neighbour]!=k)
                    {
                        max = Math.max(max, dist[k] - dist[neighbour]);
                    }
                }
            }
        }
        return max;
    }
}
