package DSA;

public class MaxWaterLevel2 {

    public static void main(String[] args) {
        MaxWaterLevel2 solution = new MaxWaterLevel2();
        int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result = solution.maxArea(heights);
        System.out.println("The maximum area is: " + result);
    }

    public int maxArea(int[] a) {
        int left = 0;
        int right = a.length - 1;
        int max = 0;
        while (left < right) {
            int w = right - left;
            int h = Math.min(a[left], a[right]);
            int currentvalue = w * h;
            if (max < currentvalue) {
                max = currentvalue;
            }
            if (a[left] < a[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
