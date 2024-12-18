package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleHashing {
    private static int[] table;
    private static int size;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        int[] elements = new int[size];

        for (int i = 0; i < size; i++) {
            elements[i] = s.nextInt();
        }

        table = new int[size];
        Arrays.fill(table, -1);
        insert(elements);
        display();

        s.close();
    }

    private static int h1(int x) {
        return x % size;
    }

    private static int h2(int x) {
        return 7 - (x % 7);
    }

    private static int h3(int x, int j) {
        return (h1(x) + j * h2(x)) % size;
    }

    private static void insert(int[] elements) {
        for (int element : elements) {
            int index = h1(element);
            if (table[index] == -1) {
                table[index] = element;
            } else {
                int j = 1;
                while (true) {
                    index = h3(element, j);
                    if (table[index] == -1) {
                        table[index] = element;
                        break;
                    }
                    j++;
                }
            }
        }
    }

    private static void display() {
        for (int i = 0; i < size; i++) {
            if (table[i] != -1) {
                System.out.println("index " + i + " value = " + table[i]);
            }
        }
    }
}