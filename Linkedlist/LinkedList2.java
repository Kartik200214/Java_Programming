import java.util.*;
// Add in the middle -> O(n)
// add(index,data)

// Print size of LL
public class LinkedList2
{
    public static class Node{
        int data;
        Node next;

        public Node(int data){ // constructor
            this.data= data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        
        // step 2 = newNode next = head;
        newNode.next = head;

        // step 3 - head = newNode
        head = newNode;

    }

    public void addLast(int data)
    {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        tail.next = newNode; // tail chya next la point to newNode
        tail = newNode;  // naye node ko tail banadu
    }

    public void addMiddle(int idx,int data) //<<<<<
    {
        if(idx == 0) // for insert at first position
        {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1)  // stop to prev node where add new node
        {
            temp = temp.next;
            i++;
        }

        // when i = idx -1; temp-> prev  
        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    public void print() // O(n) liner time complexity
    {
        // if(head == null)
        // {
        //     System.out.println("LL is empty");
        //     return;
        // }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String arg[])
    {
        LinkedList2 ll = new LinkedList2(); // create object ll
        
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(40);
        ll.addLast(50);
        ll.addMiddle(2,30);

        ll.print(); 
        System.out.println("size of LL = " + ll.size);
    }
}