import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int[] result = new int[n];
        int start = 0;
        int end = n - 1;
        int index = 0;
        while (start <= end) {
            if (index < n) {
                result[index++] = arr[end--];
            }
            if (index < n) {
                result[index++] = arr[start++];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}