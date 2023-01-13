import java.util.Scanner;

public class ForLoop6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int range = sc.nextInt();
        int counter = 1;

        //initialisation    condition      updation
        
        // for(counter = 1; counter <= range; counter++)
        // {
        //     System.out.println("* * * * * *");
        // }

        while(counter <= range)
        {
            System.out.println("*   *   *   *");
            counter++;
        }
    

    }
    
}
