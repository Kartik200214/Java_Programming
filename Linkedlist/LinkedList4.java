import java.util.*;

// Complete linked list

public class LinkedList4
{
    public static class Node
    {
        int data;
        Node next;

        public Node(int data) // constructor
        {
            this.data = data;
            this.next = null;
        }
    
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {   
        // step 1: create new node
        Node newNode = new Node(data);
        size++;
        if(head == null) // if LL contain 1 node
        {
            head= tail = newNode;
            return;
        }
        
        newNode.next = head;

        head = newNode;
    }

    public void addLast(int data)
    {
        // step 1 : create new node
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode; 
    }

    public void addMiddle(int idx,int data)
    {
        if(idx == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    
    }
    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size =  0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node prev = head;
        for(int i = 1;i < size-1;i++ )
        {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void print()
    {
        Node temp = head;
        while(temp != null)
        {   
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");

    } 
    public static void main(String arg[])
    {
        LinkedList4 obj = new LinkedList4();
        obj.addFirst(50);
        obj.addFirst(20);
        obj.addFirst(10);
        obj.addMiddle(2, 30);
        obj.addMiddle(3, 40);
        obj.print();
        obj.removeFirst();
        obj.print();
        obj.removeLast();
        obj.print();
        System.out.println("Size of LL = "+ obj.size);

    }
    

    
}