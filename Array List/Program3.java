// Problem : Print Reverse of an ArrayList
// list = 1,2,3,4,5
// Output = 5,4,3,2,1

import java.util.*;

public class Program3 {
    public static void main(String arg[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(int i = list.size()-1;i >= 0;i-- )  // O(n)
        { 
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
    
}
