import java.util.Scanner;

public class CheckEven {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int Number = sc.nextInt();

        if(Number % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("ODD");
        }


    }
}
