import java.util.*;
// Remove in a Linked List
// remove first


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
        size = 0;
        return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;

}

// remove last

public int removeLast()
{
    if(size == 0)
    {
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
        
    }
    else if(size == 1)
    {
        int val = head.dat;
        head = tail = null;
        size  =0 ;
        return val;
    }

    // prev : i = size - 2
    Node prev = head;
    for(int i = 0;i<size-2;i++)
    {
        prev = prev.next;
    }
    int val = prev.next.data; // tail.data
    prev.next = null;
    tail = prev;
    size--;
    return val;
}
public class LinkedList3
{
    
}