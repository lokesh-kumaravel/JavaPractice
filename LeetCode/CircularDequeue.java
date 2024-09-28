package LeetCode;
public class CircularDequeue {

    public static void main(String[] args) {
        MyCircularDeque deque = new MyCircularDeque(5);

        System.out.println("Inserting 10 at front: " + deque.insertFront(10)); 
        System.out.println("Inserting 20 at last: " + deque.insertLast(20));   
        System.out.println("Inserting 30 at front: " + deque.insertFront(30)); 
        System.out.println("Inserting 40 at last: " + deque.insertLast(40));   
        System.out.println("Inserting 50 at last: " + deque.insertLast(50));   
        System.out.println("Trying to insert 60 at front (deque full): " + deque.insertFront(60)); 

        // Check the current front and rear
        System.out.println("Front element: " + deque.getFront()); 
        System.out.println("Rear element: " + deque.getRear());   

        // Check if deque is full
        System.out.println("Is deque full? " + deque.isFull());   

        // Delete elements from both ends
        System.out.println("Deleting front: " + deque.deleteFront()); 
        System.out.println("Deleting last: " + deque.deleteLast());   

        // Insert more elements after deletion
        System.out.println("Inserting 60 at front: " + deque.insertFront(60)); 
        System.out.println("Inserting 70 at last: " + deque.insertLast(70));   

        // Final state of deque
        System.out.println("Final front element: " + deque.getFront()); 
        System.out.println("Final rear element: " + deque.getRear());   

        // Check if deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty()); 
    }
}

class MyCircularDeque {
    private int head, tail, size, n;
    private final int[] a;

    public MyCircularDeque(int k) {
        a = new int[k];
        n = a.length;
        tail = 1;
    }

    public boolean insertFront(int x) {
        if (size == n) return false;
        a[head = ++head % n] = x;
        size++;
        return true;
    }

    public boolean insertLast(int x) {
        if (size == n) return false;
        a[tail = (--tail + n) % n] = x;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (size == 0) return false;
        head = (--head + n) % n;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (size == 0) return false;
        tail = ++tail % n;
        size--;
        return true;
    }

    public int getFront() {
        return size == 0 ? -1 : a[head];
    }

    public int getRear() {
        return size == 0 ? -1 : a[tail];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == a.length;
    }
}
