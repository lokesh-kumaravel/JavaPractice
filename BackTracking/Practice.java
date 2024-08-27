import java.util.*;
public class Practice {
    public static void main(String[] args) {
        String str = "baloonnn";
        char[] a = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<a.length;i++)
        {
            map.put(a[i],map.getOrDefault(a[i], 0)+1);
            if(map.get(a[i])<min)
            {
                min = map.get(a[i]);
            }
        }
        System.out.println(min);
    }   
}