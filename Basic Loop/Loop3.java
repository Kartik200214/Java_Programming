import java.util.Scanner;

public class Loop3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range : ");
        int range = sc.nextInt();
        int counter = 1;
        while(counter <= range)
        {
            System.out.println(counter);
            counter++;
        }
        System.out.println();

    }
    
}
