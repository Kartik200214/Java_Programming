import java.util.*;
// Problem : Swap 2 Numbers ArrayList
// list = 2,5,9,3,6   index: idx=1 idx2=3
// Output =  2,3,9,5,6
public class Program5 {

    public static void Swap(ArrayList<Integer> list,int idx1,int idx2)
    {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);


    }
    public static void main(String arg[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int idx1 = 1,idx2=3;
        System.out.println(list);

        Swap(list, idx1, idx2);
        System.out.println(list);



    }
    
}
