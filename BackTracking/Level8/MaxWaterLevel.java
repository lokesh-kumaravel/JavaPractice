package Level8;
import java.util.*;
public class MaxWaterLevel
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] stri = str.split(",");
        int[] a = new int[stri.length];
        for(int i = 0;i<a.length;i++)
        {
            a[i] = Integer.parseInt(stri[i]);
        }
        int k = check(a);
        System.out.println(k);
    }
    private static int check(int[] height)
    {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}