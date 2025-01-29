package Level4;
import java.util.*;
public class Sortoddeven
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        s.close();
        int i;
        int d = -1;
        int f;
        if(n%2==0)
        {
            f = n;
        }
        else
        {
            f = n+2-1;
        }
        for(i = 1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.print(a[d+=2]+" ");
            }
            else if(i%2!=0)
            {
                System.out.print(a[f-=2]+" ");
            }
        }
    }
}