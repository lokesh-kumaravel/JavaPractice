package Level4;

import java.util.*;
public class LicensePlate
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine().toLowerCase();
        String s2 = s.nextLine();
        char[] a = s1.toCharArray();
        char[] a1 = new char[a.length];
        int l1 = 0;
        s.close();
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]>='a'&&a[i]<='z')
            {
                a1[l1++] = a[i];
            }
        }
        String[] m = s2.split(" ");
        int c = 0;
        int[] arr = new int[m.length];
        for(int i = 0;i<m.length;i++)
        {
            char[] main = m[i].toCharArray();
            for(int j = 0;j<a1.length;j++)
            {
                for(int k = 0;k<main.length;k++)
                {
                    if(a1[j] == main[k])
                    {
                        main[k] = 32;
                    }
                }
            }
            for(int k = 0;k<main.length;k++)
            {
                if(main[k]==32)
                {
                    c++;
                }
            }
            arr[i] = c;
            c = 0;
        }
        int max = 0;
        int p = 0;
        for(int i = 0;i<arr.length;i++)
        {
            if(max<a[i])
            {
                max = a[i];
                p = i;
            }
        }
        if(max!=1)
        {
            System.out.println(m[p]);
        }
        else
        {
            System.out.println(m[p+1]);
        }
    }
}