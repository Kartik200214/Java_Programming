import java.util.*;

class Program1
{
    public static void main(String arg[])
    { 
        
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);  
        list.add(2);
        list.add(3);
        list.add(4);
        
        // add Operation
        list.add(4, 5);  

        System.out.println(list);

        // Get Operation 
        int element = list.get(2);

        System.out.println(element);

        // Remove Operation

        list.remove(2);
        System.out.println(list);

        // Set Element at Index
        list.set(2,10);
        System.out.println(list);

        // contains
        System.out.println(list.contains(11)); // false
        System.out.println(list.contains(1));  // true
        
    }
}
