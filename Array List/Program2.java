import java.util.ArrayList;

public class Program2 {
    public static void main(String arg[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list.size()); // method

        // print the ArrayList

        for(int i = 0; i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
    
}
