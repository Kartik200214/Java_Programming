import java.util.Scanner;

public class WhileLoop4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int range = sc.nextInt();
        int counter = 1,Sum = 0;
        while(counter <= range)
        {
            Sum = Sum + counter;
            counter++;
        }
        System.out.println("Addition of Number is : "+Sum);

    }
    
}
