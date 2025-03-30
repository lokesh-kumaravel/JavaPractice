package DailyTask;

import java.util.*;

class Stack {
    int n;
    ArrayList<Object> arr;
    int index;

    Stack(int n) {
        index = 0;
        this.n = n;
        arr = new ArrayList<>();
    }

    void push(Object k) {
        if (arr.size() >= n) {
            System.out.println("Stack Overflow");
        } else {
            arr.add(k);
        }
    }

    void pop() {
        if (arr.size() <= 0) {
            System.out.println("Stack Underflow");
        } else {
            arr.remove(arr.size() - 1);
        }
    }

    ArrayList print() {
        return arr;
    }

    void isEmpty() {
        if (index <= 0) {
            System.out.println("True");
            return;
        }
        System.out.println("False");
    }
}

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        Stack stack1 = new Stack(5);
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // stack.push(4);
        // stack.push(5);
        // stack.pop();
        stack1.push("Lokesh");
        stack1.push("Cse");
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.pop();
        stack1.pop();
        stack.isEmpty();
        // System.out.println(stack.print());
        System.out.println(stack1.print());
    }
}