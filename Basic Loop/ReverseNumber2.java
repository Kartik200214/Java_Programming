import java.util.Scanner;

public class ReverseNumber2 {
    public static void main(String arg[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Number : ");
       int Number = sc.nextInt();
       int rev = 0;
       
       while( Number > 0)
        {
            int lastDigit = Number % 10;
            rev = (rev * 10) + lastDigit;
            Number = Number / 10;
        }
        System.out.println(rev);

    }
    
}
