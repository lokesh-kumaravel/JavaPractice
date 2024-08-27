package Level4;

import java.util.*;
public class Flower
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        String[] a = str.split(" ");
        char[][] m = new char[7][7];
            int l = 0;
        for(int i =0;i<a.length;i++)
        {
            char[] ch = a[i].toCharArray();
            for(int j = l;j<l+1;j++)
            {
                for(int k = 0;k<ch.length;k++)
                {
                    m[j][k] = ch[k];
                }
            }
            l++;
        }
        for(int i = 0;i<l+1;i++)
        {
            for(int j = 0;j<l+1;j++)
            {
                if(m[i][j] == m[i+1][j])
                {
                    System.out.print(m[i][j]);
                    m[i+1][j] = ' ';
                }
                else
                {
                    return;
                }
            }
        }
    }
}