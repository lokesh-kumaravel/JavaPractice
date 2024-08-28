import java.util.*;
public class Practice {
    public static void main(String[] args) {
        String str = "loonbalxballpoon";
        char[] a = str.toCharArray();
        if(a.length<7)
        {
            System.out.println(0);
        }
       Map<Character,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<a.length;i++)
        {
            if(a[i]=='b'||a[i]=='a'||a[i]=='l'||a[i]=='o'||a[i]=='n')
            {
                map.put(a[i],map.getOrDefault(a[i], 0)+1);
            }
        }
        String t = "balon";
        char[] te = t.toCharArray();
        for(int i = 0;i<te.length;i++)
        {
            if(map.containsKey(te[i]))
            {
            int m = map.get(te[i]);
            if(te[i]=='l'||te[i]=='o')
            {
                m/=2;
            }
            if(m<min){
                min = m;
            };
            }
        }
        if(map.size()==5)
        {
            System.out.println(min);
        }
        else
        {
            System.out.println(0);
        }
        System.out.println(map.size());
    }   
}