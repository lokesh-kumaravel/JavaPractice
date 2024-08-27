package Level4;

import java.util.*;
public class GrandchildCount
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String[] a = new String[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = s.nextLine();
        }
        String k = s.nextLine();
        s.close();
        String str="";
        int d = 0;
        int max = 0;
        for(int i = 0;i<n;i++)
        {
            String b[] = a[i].split(" ");
            if(b[1].equals(k))
            {
                str = b[0];
            }
            if(str.length()!=0)
            {
                for(int j = 0;j<n;j++)
                {
                    String c[] = a[j].split(" ");
                    if(c[1].equals(str))
                    {
                        d++;
                    }
                }
                if(d>max)
                {
                    max = d;
                }
                d = 0;
            }
        }
        System.out.println(max);
    }
}