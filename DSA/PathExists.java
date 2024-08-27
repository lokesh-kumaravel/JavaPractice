package DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PathExists {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int v = s.nextInt();
        for(int i = 0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i = 0;i<v;i++)
        {
            int n1 = s.nextInt()-1;
            int n2 = s.nextInt()-1;
            list.get(n1).add(n2);
            // list.get(n2).add(n1);
        }
        int from = s.nextInt()-1;
        int to = s.nextInt()-1;
        s.close();
        if(BFS(from,to,n))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    public static boolean BFS(int start,int end,int n)
    {
        Queue<Integer> q = new LinkedList<>();
        // boolean[] visited = new boolean[n];
        q.add(start);
        while(q.size()>0)
        {
        int k = q.remove();
        if(k==end)
        {
            return true;
        }
        for(int i = 0;i<list.get(k).size();i++)
        {
            int m = list.get(k).get(i);
            // BFS(m,end,n);
            // if(!visited[m])
            // {
                q.add(m);
                // visited[m] = true;
            // }
        }
        }
        return false;
    }
}
