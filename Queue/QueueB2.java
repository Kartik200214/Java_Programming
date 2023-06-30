// Implimentation of Circular Queue using array.
import java.util.*;

public class QueueB2{
    static class Queue
    {
        static int size;
        static int arr[];
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1; 
        }

        public static boolean isFull()
        {
            return (rear+1)% size == front; // (rear+1)% size means arr[0]
        }

        // add
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is full");
                return;
            }
            // add 1st element
            if(front == -1)
            {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;

        }
        // remove
        public static int remove(){
            if(isEmpty())
            {
                System.out.println("empty queue");
                return -1;
            }


            int result = arr[front];
            
            //last element delete
            if(rear == front) 
            {
                rear = front = - 1;   
            }
            else{
                front = (front +  1) % size;
            }
            return result;
        }

        // peek O(1)
        public static int peek(){
            if(isEmpty())
            {
                System.out.println("Empty queue");
                return -1;
            }
            return arr[front];   
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }
}