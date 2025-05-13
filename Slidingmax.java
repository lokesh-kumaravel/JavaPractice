import java.util.*;

public class Slidingmax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] in = input.split(",");
        int[] nums = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            nums[i] = Integer.parseInt(in[i].trim());
        }
        int k = s.nextInt();
        List<Integer> result = new ArrayList<>();
        for (int left = 0; left <= nums.length - k; left++) {
            int right = left + k - 1;
            int max = nums[left];
            for (int i = left; i <= right; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            result.add(max);
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(",");
            }
        }

    }
}
