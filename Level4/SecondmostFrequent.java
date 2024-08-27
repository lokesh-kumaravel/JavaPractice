package Level4;
import java.util.*;
public class SecondmostFrequent
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        char[] a = str.toCharArray();
        int[] b = new int[a.length];
        char[] k = new char[a.length];
        for(int i = 0;i<a.length;i++)
        {
            int c = 1;
            for(int j = i+1;j<a.length;j++)
            {
                if(a[i]==a[j]&&a[i]!=' ')
                {
                    c++;
                    a[j] = ' ';
                }
            }
            k[i] = a[i];
            b[i] = c;
        }
        for(int i = 0;i<a.length;i++)
        {
            for(int j = i+1;j<a.length;j++)
            {
                if(b[i]<b[j])
                {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                    char t = k[i];
                    k[i] = k[j];
                    k[j] = t;
                }
            }
        }
        if(b[1]>1)
        {
            System.out.println("Second most frequent character is "+k[1]);
        }
        else
        {
            System.out.println("No Second most frequent character");
        }
    }
}
