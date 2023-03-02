import java.util.*;
// Problem : Find Maximum in an ArrayList
// list = 2,5,9,3,6
// Output = 9
public class Program4 {
    public static void main(String arg[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int max = Integer.MIN_VALUE;
        for(int i = 0;i <list.size();i++ )  // O(n)
        { 
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }

            max = Math.max(max, list.get(i));
        }
        System.out.println("max element = "+max);

    }
    
}
