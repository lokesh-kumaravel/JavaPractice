package DSA;

import java.util.Scanner;

public class SLL {
    static Node head;
    static class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public static void insert(int data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
        }
        else {
            Node last = head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = newnode; 
        }
    }
    public static void printlist()
    {
        Node current = head;
        while(current!=null)
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        {
            insert(s.nextInt());
        }
        s.close();
        printlist();
    }
}
