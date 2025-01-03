import java.util.*;

public class DailyTemperature {

    // Method to calculate the days until a warmer temperature
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int temp = temperatures[i];
            while (!stack.isEmpty() && stack.peek()[0] < temp) {
                int[] prev = stack.pop();
                answer[prev[1]] = i - prev[1];
            }
            stack.push(new int[] { temp, i });
        }
        return answer;
    }

    public static void main(String[] args) {
        // Create an instance of DailyTemperature
        DailyTemperature solution = new DailyTemperature();

        // Example input
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };

        // Call the dailyTemperatures method and get the result
        int[] result = solution.dailyTemperatures(temperatures);

        // Output the result
        System.out.println("Days to wait for a warmer temperature:");
        System.out.println(Arrays.toString(result));
    }
}
