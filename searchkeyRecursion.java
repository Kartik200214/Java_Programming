// Search for a key in a Linked list.Return the position where it is found. If not found return -1.Use Recursion

public class searchkeyRecursion{ // Use Recursion

    public static class Node
    {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }
    public void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.err.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public int helper(Node head,int key) // O(n)
    {
        if(head == null)
        {
            return -1;
        }

        if(head.data == key)
        {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1)
        {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key)
    {
        return helper(head, key);
    }

    public static void main(String arg[])
    {
        searchkeyRecursion  obj = new searchkeyRecursion();
        obj.addFirst(50);
        obj.addFirst(40);
        obj.addFirst(30);
        obj.addFirst(20);
        obj.addFirst(10);
        obj.print();
        System.out.println(obj.recSearch(30));
        System.out.println(obj.recSearch(60));


    }
    
}
