package DataStructures.canJump;

public class Greedy2 {
    public static void main(String[] args) {
        int[] a = { 3, 2, 1, 0, 4 };
        int ans = find(a);
        System.out.println("Minimum jumps : " + ans);
    }

    public static int find(int[] a) {
        int count = 0;
        int near = 0, far = 0;
        while (far < a.length - 1) {
            int farthest = 0;
            for (int i = near; i <= far; i++) {
                farthest = Math.max(farthest, i + a[i]);
            }
            near = far + 1;
            far = farthest;
            count++;
        }
        return count;
    }
}
