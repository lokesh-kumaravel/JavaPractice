import java.util.*;

public class AbsoluteDiff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(s.nextInt());
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.println(Math.abs(list.get(i) - list.get(i + 1)));
        }
    }
}