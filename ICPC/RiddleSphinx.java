package ICPC;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class RiddleSphinx {

  static int[][] questions = {
      { 1, 1, 1 },
      { 1, 0, 0 },
      { 0, 1, 0 },
      { 0, 0, 1 },
      { 3, 2, 1 },
  };

  static int ask(int round) {
    Scanner sc = new Scanner(System.in);
    int val = -1;
    System.out.println(Arrays.toString(questions[round]) + ": ");
    val = sc.nextInt();
    System.out.println();
    sc.close();
    return val;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println(Arrays.toString(questions[0]) + ": ");
    int a = sc.nextInt();
    System.out.println(Arrays.toString(questions[1]) + ": ");
    int b = sc.nextInt();
    System.out.println(Arrays.toString(questions[2]) + ": ");
    int c = sc.nextInt();
    System.out.println(Arrays.toString(questions[3]) + ": ");
    int d = sc.nextInt();
    System.out.println(Arrays.toString(questions[4]) + ": ");
    int e = sc.nextInt();
    LocalTime st = LocalTime.now();

    if (b + c + d == a || (b * 3 + c * 2 + d * 1) == e) {
      System.out.println("Answer: " + b + " " + c + " " + d);
    } else {
      double x = (e - d - (2 * c)) / 3.0;
      double y = (e - d - (3 * b)) / 2.0;
      double z = (e - (2 * c) - (3 * b));
      System.out.println(x + " " + y + " " + z);
      if (x + c + d == a) {
        System.out.println("Answer: " + x + " " + c + " " + d);
      }
      if (y + b + d == a) {
        System.out.println("Answer: " + b + " " + y + " " + d);
      }
      if (z + b + c == a) {
        System.out.println("Answer: " + b + " " + c + " " + z);
      }
    }

    LocalTime et = LocalTime.now();
    Duration duration = Duration.between(st, et);

    System.out.println("Execution time: " + duration.toMillis() + " milliseconds");

    sc.close();
  }
}