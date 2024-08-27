package DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ConnectedComponents {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int v = s.nextInt();
        ArrayList<Boolean> visited = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            list.add(new ArrayList<Integer>());
            visited.add(false);
        }
        for(int i = 0;i<v;i++)
        {
            addedge(s.nextInt()-1,s.nextInt()-1);
        }
        int c = 1;
        for(int i = 0;i<n;i++)
        {
            if(!visited.get(i))
            {
            BFS(i,n,visited);
            if(visited.contains(false))
            {
                c++;
            }
            else
            {
                break;
            }
            }
        }
        s.close();
        System.out.println(c);
    }
    public static void addedge(int u,int v)
    {
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public static void BFS(int start,int n,ArrayList<Boolean> visited)
    {
        Queue<Integer> q = new LinkedList<>();
        
        q.add(start);
        visited.set(start,true);
        while(!q.isEmpty())
        {
            int k = q.poll();
            // System.out.print(1+k+" ");
            for(int i = 0;i<list.get(k).size();i++)
            {
                if(!visited.get(list.get(k).get(i)))
                {
                    int m = list.get(k).get(i);
                    q.add(list.get(k).get(i));
                    visited.set(m,true);
                }
            }
        }
    }
}
