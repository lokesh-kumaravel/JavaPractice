package TimeComplexity;

import java.util.*;
public class Factors
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        ArrayList<Long> l = new ArrayList<>();
        ArrayList<Long> a = new ArrayList<>();
        for(long i = 1;i<Math.sqrt(n);i++)
        {
            long k = n/i;
            if(k*i==n)
            {
                a.add(k);
                l.add(i);
            }
        }
        Iterator<Long> itr1 = a.iterator();
        Iterator<Long> itr2 = l.iterator();
        long max = Long.MAX_VALUE;
        while(itr1.hasNext())
        {
            Long k = itr1.next();
            Long j = itr2.next();
            if(max>k+j)
            {
                max = k+j;
            }
        }
        System.out.print(max);
        s.close();
    }
}