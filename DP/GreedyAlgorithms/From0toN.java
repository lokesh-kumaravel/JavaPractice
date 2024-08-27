package DP.GreedyAlgorithms;

import java.util.Scanner;

public class From0toN
{
    public static void main(String[] args)
    {
        Scanner s  = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0;i<t;i++)
        {
            int n = s.nextInt();
        int c = 0;
        while(n!=0)
        {
            if(n%2==0)
            {
                c++;
                n = n/2;
            }
            else
            {
                c++;
                n = n-1;
            }
        }
        System.out.println(c);
        }
        s.close();
    }
}