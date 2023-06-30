// Implimentation of Queue using collection.
import java.util.*;

public class QueueB4{

    public static void main(String[] args) {

        // Queue<Integer> q = new LinkedList<>(); //  Queue is interface 
        Queue<Integer> q = new ArrayDeque<>();

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

// time complexity = O(1)