package ExpressionConversion;

import java.util.Stack;

public class QueueUsingStack {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public void push(int n) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(n);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public void pop() {
        int poppedElement = stack1.pop();
        System.out.println("Popped Element : " + poppedElement);
    }

    public static void print() {
        System.out.println(stack1);
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        print();

        queue.pop();
    }
}
