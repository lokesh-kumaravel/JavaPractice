package Level8;

public class RedBallInDiagonal {
    public static void main(String[] args) {
        int n = 2;
        char[][] a = {
                { 'G', 'R' },
                { 'R', 'G' }
        };
        int moves = FindMoves(n, a);
        System.out.println("Minimum no of Moves:" + moves);
    }

    public static int FindMoves(int n, char[][] a) {
        int[] markLastRedBallsinRow = new int[n];
        for (int i = 0; i < n; i++) {
            int pos = -1;
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 'R') {
                    pos = j;
                }
            }
            markLastRedBallsinRow[i] = pos;
            System.out.println(markLastRedBallsinRow[i]);
        }
        int moves = 0;

        for (int i = 0; i < n; i++) {
            if (markLastRedBallsinRow[i] <= i) {
                continue;
            }
            int j = i;
            while (j < n && markLastRedBallsinRow[j] > i) {
                j++;
            }
            if (j == n) {
                return -1;
            }
            while (j > i) {
                int temp = markLastRedBallsinRow[j];
                markLastRedBallsinRow[j] = markLastRedBallsinRow[j - 1];
                markLastRedBallsinRow[j - 1] = temp;
                j--;
                moves++;
            }
        }
        return moves;
    }
}