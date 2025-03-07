import java.util.*;

public class DiceGame {

    private static double calculateScore(List<Integer> D1, List<Integer> D2) {
        int n = D1.size();
        int m = D2.size();

        Collections.sort(D1);
        Collections.sort(D2);

        double score = 0.0;
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (D1.get(i) > D2.get(j)) {
                score += (n - i) / (double) n;
                j++;
            } else if (D1.get(i) < D2.get(j)) {
                i++;
            } else {
                score += 0.5;
                i++;
                j++;
            }
        }

        while (i < n) {
            score += 0.5;
            i++;
        }

        return score / m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        List<Integer> D1 = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            D1.add(sc.nextInt());
        }

        int n2 = sc.nextInt();
        List<Integer> D2 = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            D2.add(sc.nextInt());
        }

        double scoreD1D2 = calculateScore(D1, D2);

        double lowestScore = 1.0;
        double highestScore = 0.0;

        System.out.printf("%.9f %.9f\n", lowestScore, highestScore);
    }
}
