package Level4;

import java.util.*;
public class Rotationcheck
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        for(int i = 0;i<n;i++)
        {
            String a = s.nextLine();
            String b = s.nextLine();
            s.close();
            char[] c = a.toCharArray();
            for(int j = 0;j<c.length;j++)
            {
                char first = c[0];
                for(int k =0;k<c.length-1;k++)
                {
                    c[k] = c[k+1];
                }
                c[c.length-1] = first;
                String d = new String(c);
                if(d.equals(b))
                {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
}