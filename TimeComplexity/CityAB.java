package TimeComplexity;

import java.util.*;

public class CityAB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int km = s.nextInt();
        int d = s.nextInt();
        int n = s.nextInt();
        List<Integer> day = new ArrayList<>();
        List<Integer> nkm = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            day.add(s.nextInt());
            nkm.add(s.nextInt());
        }
        s.close();
        System.out.println(find(km, d, n, day, nkm));
    }

    private static int find(int km, int d, int n, List<Integer> day, List<Integer> nkm) {
        int sum = 0;
        int count = 0;
        Iterator<Integer> itr = nkm.iterator();
        while (itr.hasNext()) {
            sum += itr.next();
            count++;
        }
        if (sum < km) {
            for (int i = 0; sum < km; i++) {
                sum += d;
                count++;
            }
        }
        return count;
    }
}