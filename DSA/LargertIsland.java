package DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LargertIsland {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static int c = 0;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =0 ;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        int v = s.nextInt();
        for(int i = 0;i<v;i++)
        {
            addedge(s.nextInt()-1,s.nextInt()-1);
        }
        boolean[] visited = new boolean[n];
        for(int i = 0;i<n;i++)
        {
            if(!visited[i])
            {
            int k = BFS(i,n,visited,0);
            if(k>c)
            {
                c = k;
            }
            }
        }
            System.out.println(c);
            s.close();
    }
    public static void addedge(int u,int v)
    {
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public static int BFS(int start,int n,boolean[] visited,int c)
    {
        Queue<Integer> q = new LinkedList<>();
        if(!visited[start])
        {
            visited[start] = true;
            q.add(start);
            while(!q.isEmpty())
            {
                c++;
                int k = q.remove();
                for(int i = 0;i<list.get(k).size();i++)
                {
                    int m = list.get(k).get(i);
                    if(!visited[list.get(k).get(i)])
                    {
                        q.add(list.get(k).get(i));
                        visited[m] = true;
                    }
                }
            }
        }
        return c;
    }
}
