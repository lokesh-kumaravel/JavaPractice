package DSA;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class CycleorNot {
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
        }
        s.close();
        // System.out.println(list);
        BFS(0,n);
    }
    public static void BFS(int start,int n)
    {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n];
        visited[start] = true;
        stack.add(start);
        while(!stack.isEmpty())
        {
            int k = stack.pop();
            visited[k] = true;
            for(int i = 0;i<list.get(k).size();i++)
            {
                if(visited[list.get(k).get(i)]==true)
                {
                    System.out.println("YES");
                    return;
                }
                else
                {
                    stack.add(list.get(k).get(i));
                }
            }
        }
                    System.out.println("NO");
    }
}
