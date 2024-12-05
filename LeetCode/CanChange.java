package LeetCode;

public class CanChange {
    public static void main(String[] args) {
        String start = "_L__R__R_";
        String target = "L______RR";

        int n = start.length();
        int i = 0;
        int j = 0;

        boolean canTransform = true;

        while (i <= n && j <= n) {
            // Skip underscores in `start`
            while (i < n && start.charAt(i) == '_') {
                i++;
            }
            // Skip underscores in `target`
            while (j < n && target.charAt(j) == '_') {
                j++;
            }
            // If either pointer reaches the end, check validity
            if (i == n || j == n) {
                canTransform = i == n && j == n;
                break;
            }
            // If characters do not match, transformation is impossible
            if (start.charAt(i) != target.charAt(j)) {
                canTransform = false;
                break;
            }
            // Validate positions for 'L' and 'R'
            if (start.charAt(i) == 'L') {
                if (i < j) {
                    canTransform = false; // 'L' cannot move right
                    break;
                }
            } else { // start.charAt(i) == 'R'
                if (i > j) {
                    canTransform = false; // 'R' cannot move left
                    break;
                }
            }
            i++;
            j++;
        }

        // Output the result
        System.out.println("Can transform? " + canTransform);
    }
}
