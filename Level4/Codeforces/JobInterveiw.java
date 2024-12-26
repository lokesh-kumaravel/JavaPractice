package Level4.Codeforces;

import java.util.*;

public class JobInterveiw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of programmers
            int m = scanner.nextInt(); // Number of testers
            int total = n + m + 1; // Total number of candidates
            int[] programmingSkills = new int[total];
            int[] testingSkills = new int[total];
            for (int i = 0; i < total; i++) {
                programmingSkills[i] = scanner.nextInt();
            }
            for (int i = 0; i < total; i++) {
                testingSkills[i] = scanner.nextInt();
            }
            int[] teamSkills = calculateTeamSkills(n, m, programmingSkills, testingSkills);
            for (int skill : teamSkills) {
                System.out.print(skill + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static int[] calculateTeamSkills(int n, int m, int[] programmingSkills, int[] testingSkills) {
        int[] teamSkills = new int[programmingSkills.length];
        int programmerMax = Integer.MIN_VALUE;
        int testerMax = Integer.MIN_VALUE;
        for (int i = 0; i < programmingSkills.length; i++) {
            if (programmingSkills[i] > programmingSkills[programmerMax]) {
                programmerMax = i;
            }
            if (testingSkills[i] > testingSkills[testerMax]) {
                testerMax = i;
            }
        }
        int programmerSkill = 0;
        int testerSkill = 0;
        for (int i = 0; i < programmingSkills.length; i++) {
            if (i != programmerMax) {
                programmerSkill += programmingSkills[i];
            }
            if (i != testerMax) {
                testerSkill += testingSkills[i];
            }
        }
        for (int i = 0; i < programmingSkills.length; i++) {
            if (i == programmerMax) {
                teamSkills[i] = testerSkill;
            } else if (i == testerMax) {
                teamSkills[i] = programmerSkill;
            } else {
                teamSkills[i] = programmerSkill + testerSkill - programmingSkills[i] - testingSkills[i];
            }
        }
        return teamSkills;
    }
}
