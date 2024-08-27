package DP;

import java.util.Scanner;

public class Maze {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long m = s.nextLong();
        s.close();
        long[][] a = new long[(int)n+1][(int)m+1];
        for(long i = 1;i<=n;i++)
        {
            for(long j = 1;j<=m;j++)
            {
                if(i==1||j==1)
                {
                    a[(int)i][(int)j] = 1;
                }
            }
        }
        for(long i = 1;i<=n;i++)
        {
            for(long j = 1;j<=m;j++)
            {
                if(a[(int)i][(int)j]==0)
                {
                    a[(int)i][(int)j] = a[(int)i][(int)j-1]+a[(int)i-1][(int)j];
                }
            }
        }
        System.out.println(a[(int)n][(int)m]);
    }
}
