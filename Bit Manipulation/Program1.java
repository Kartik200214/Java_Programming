import java.util.*;

public class Program1 {

    public static void oddOrEven(int n)
    {
        int bitMask = 1;
        if((n & bitMask) == 0)
        {
            //even number
            System.out.println("even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
    public static void main(String arg[])
    {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);
    }
}
