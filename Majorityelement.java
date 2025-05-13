import java.util.*;

public class Majorityelement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int len = n / 2;
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() > len) {
                System.out.println(i.getKey());
                return;
            }
        }
        System.out.println(0);
    }
}