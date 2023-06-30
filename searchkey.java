// Search for a key in a Linked list.Return the position where it is found. If not found return -1.

public class searchkey{

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

    public int itrSearch(int key) //O(n) linear time
    {
        Node temp = head;
        int i = 0;
        while(temp != null)
        {
            if(temp.data == key){ // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    public static void main(String arg[])
    {
        searchkey  obj = new searchkey();
        obj.addFirst(50);
        obj.addFirst(40);
        obj.addFirst(30);
        obj.addFirst(20);
        obj.addFirst(10);
        obj.print();
        System.out.println(obj.itrSearch(30));
        System.out.println(obj.itrSearch(60));


    }
    
}
