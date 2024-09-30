package LeetCode;
import java.util.*;

class CustomStack {

    Stack<Integer> stack = new Stack<>();
    int n;  // Maximum size of the stack

    public CustomStack(int maxSize) {
        n = maxSize;
    }

    public void push(int x) {
        if (stack.size() < n) {
            stack.push(x);
            System.out.println("After push: " + stack);
        }
    }

    public int pop() {
        if (stack.size() > 0) {
            int k = stack.pop();
            System.out.println("After pop: " + stack);
            return k;
        }
        return 0;
    }

    public void increment(int k, int val) {
        int limit = Math.min(k, stack.size());
        
        for (int i = 0; i < limit; i++) {
            stack.set(i, stack.get(i) + val);
        }
        System.out.println("After increment: " + stack);
    }
    
    // Main function for testing the operations
    public static void stackOperation() {
        CustomStack customStack = new CustomStack(5);  // Create a stack with maxSize = 5
        
        customStack.push(1);  // [1]
        customStack.push(2);  // [1, 2]
        customStack.push(3);  // [1, 2, 3]
        
        customStack.increment(2, 10);  // Increment bottom 2 elements by 10, stack becomes [11, 12, 3]
        
        customStack.push(4);  // [11, 12, 3, 4]
        customStack.pop();     // Removes 4, stack becomes [11, 12, 3]
        
        customStack.increment(3, 5);  // Increment all 3 elements by 5, stack becomes [16, 17, 8]
        
        customStack.push(5);  // [16, 17, 8, 5]
        customStack.push(6);  // [16, 17, 8, 5, 6] - maxSize reached
        customStack.push(7);  // This push will not add anything because maxSize is 5
    }

    public static void main(String[] args) {
        stackOperation();
    }
}
