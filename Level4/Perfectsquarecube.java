package Level4;

import java.util.*;
public class Perfectsquarecube
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0;i<n;i++)
        {
            int k = s.nextInt();
            int[] a = new int[k];
            for(int j = 0;j<k;j++)
            {
                a[j] = s.nextInt();
            }
            s.close();
            int c = 0;
                    for(int h = 0;h<a.length;h++)
                    {
                        for(int p = 1;p<10;p++)
                        {
                        int square = p*p;
                        int cube = p*p*p;
                        for(int g = h+1;g<a.length;g++)
                        {
                            int point = a[h]+a[g];
                            if(square==point)
                            {
                                c++;
                            }
                            else if(cube == point)
                            {
                                c++;
                            }
                        }
                        }
                    }
            System.out.println(c);
        }
    }
}