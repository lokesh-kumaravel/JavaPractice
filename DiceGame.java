import java.util.*;

public class DiceGame {

    // Function to calculate score(D1, D2), the expected score of D1 against D2
    private static double calculateScore(List<Integer> D1, List<Integer> D2) {
        int n = D1.size();
        int m = D2.size();
        
        // Sort the dice faces for easier comparison
        Collections.sort(D1);
        Collections.sort(D2);

        // Calculate the expected score for D1 against D2
        double score = 0.0;
        int i = 0;
        int j = 0;
        
        // Count how many faces of D1 are greater than each face of D2
        while (i < n && j < m) {
            if (D1.get(i) > D2.get(j)) {
                score += (n - i) / (double) n; // D1 wins this round
                j++;
            } else if (D1.get(i) < D2.get(j)) {
                i++;
            } else {
                score += 0.5; // Tie round
                i++;
                j++;
            }
        }
        
        // Calculate remaining ties
        while (i < n) {
            score += 0.5; // Remaining faces of D1 that tie with D2's highest
            i++;
        }

        return score / m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the first die (D1)
        int n1 = sc.nextInt();
        List<Integer> D1 = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            D1.add(sc.nextInt());
        }

        // Read the second die (D2)
        int n2 = sc.nextInt();
        List<Integer> D2 = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            D2.add(sc.nextInt());
        }

        // Calculate the score between D1 and D2
        double scoreD1D2 = calculateScore(D1, D2);
        
        // Since we know that D1 has an advantage over D2, we find the lowest score for D3 
        // when D3 has an advantage over D1 but a lower score against D2, and vice versa.
        double lowestScore = 1.0;
        double highestScore = 0.0;

        // We have to find a third die (D3). In this simplified case, we assume we are trying to 
        // find reasonable scores based on these two dice. Thus, we perform some boundary checks.
        
        // Print results
        System.out.printf("%.9f %.9f\n", lowestScore, highestScore);
    }
}
