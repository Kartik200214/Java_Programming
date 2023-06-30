
public class ReverseLL{

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

    public  void reverse() // 3 variable & 4 step
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null)
        {
            next = curr.next; // next ban jayega curr ka next
            curr.next =prev;
            prev = curr;
            curr= next;
        }
        head = prev;
    }
    

    public static void main(String arg[])
    {
        ReverseLL  obj = new ReverseLL();
        obj.addFirst(50);
        obj.addFirst(40);
        obj.addFirst(30);
        obj.addFirst(20);
        obj.addFirst(10);

        obj.print();
        obj.reverse();
        obj.print();

    }
    
}
//time complexity - O(n)