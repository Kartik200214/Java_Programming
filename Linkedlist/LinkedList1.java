public class LinkedList1
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

    public void addFirst(int data)
    {
        // step 1 = create new node
        Node newNode = new Node(data);
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
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        tail.next = newNode; 
        tail = newNode; 
    }

    public void print() // O(n) liner time compl
    {
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
        LinkedList1 ll = new LinkedList1(); // create object ll
        ll.print();
        ll.addFirst(20);
        ll.print();
        ll.addFirst(10);
        ll.print();
        ll.addLast(30);
        ll.print();
        ll.addLast(40);
        ll.print();


    }
}
