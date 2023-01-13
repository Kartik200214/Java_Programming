import java.util.Scanner;

public class ReverseNumber {
    public static void main(String arg[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : ");
       int Number = sc.nextInt();
       
       while( Number > 0)
        {
            int lastDigit = Number % 10;
            System.out.print(lastDigit);
            Number = Number / 10;
        }
        System.out.println();

    }
    
}
