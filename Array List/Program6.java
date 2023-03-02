import java.util.*;
// import java.util.Collections;

// Problem : Sorting an ArrayList
public class Program6{
    public static void main(String arg[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);

        Collections.sort(list); // ascending 

        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder()); //decending order
 
        System.out.println(list);

        
 
    }
    
}
