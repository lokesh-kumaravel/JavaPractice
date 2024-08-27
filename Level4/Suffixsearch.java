package Level4;

import java.util.*;
public class Suffixsearch
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0;i<n;i++)
        {
            char[] a = s.next().toCharArray();
            char[] b = a;
            int c = 0;
            int j,k;
            for(int h = 0;h<a.length;h++)
            {
            for(j = h,k = 0;j<a.length;j++,k++)
            {
                    if(a[j] == b[k])
                    {
                        c++;
                    }
                    else
                    {
                        break;
                    }
            }
            }
            System.out.println(c);
        }
        s.close();
    }
}