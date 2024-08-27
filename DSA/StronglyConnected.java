package DSA;

import java.util.*;
public class StronglyConnected {
    public static ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i =0 ;i<n;i++)
        {
            list1.add(new ArrayList<>());
            list2.add(new ArrayList<>());
        }
        int v = s.nextInt();
        for(int i = 0;i<v;i++)
        {
            addedge(s.nextInt(),s.nextInt());
        }
        BFS(0,n);
        s.close();
    }
    public static void addedge(int u,int v)
    {
        list1.get(u).add(v);
        list2.get(v).add(u);
    }
    public static void BFS(int start,int n)
    {
        Queue<Integer> q1 = new LinkedList<>();
        boolean[] visited1 = new boolean[n];
        visited1[start] = true;
        q1.add(start);
        while(q1.size()>0)
        {
            int k = q1.remove();
            visited1[k] = true;
            for(int i = 0;i<list1.get(k).size();i++)
            {
                if(!visited1[list1.get(k).get(i)])
                {
                    int m = list1.get(k).get(i);
                    q1.add(m);
                    visited1[m] = true;
                }
            }
        }
        Queue<Integer> q2 = new LinkedList<>();
        boolean[] visited2 = new boolean[n];
        visited2[start] = true;
        q2.add(start);
        while(q2.size()>0)
        {
            int k = q2.remove();
            visited2[k] = true;
            for(int i = 0;i<list2.get(k).size();i++)
            {
                if(!visited2[list2.get(k).get(i)])
                {
                    int m = list2.get(k).get(i);
                    q2.add(m);
                    visited2[m] = true;
                }
            }
        }
        boolean strong = false;
        for(int i = 0;i<n;i++)
        {
            if(visited1[i]==visited2[i])
            {
                strong = true;
            }
            else
            {
                System.out.println("NO");
                strong = false;
                break;
            }
        }
        if(strong)
        {
                System.out.println("YES");
        }
    }
}
