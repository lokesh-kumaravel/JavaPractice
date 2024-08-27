package DSA;
import java.util.*;
public class SLLRev
{
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
        else
        {
            Node current = head;
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newnode;
        }
    }
    public static void rev()
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current!=null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public static void print()
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
        for(int i = 0;i<n;i++)
        {
            insert(s.nextInt());
        }
        s.close();
        rev();
        print();
    }
}