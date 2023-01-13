import java.util.*;

public class Brake {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // for(int i =1; i<= 5;i++)
        // {
        //     if(i == 3)
        //     {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("I am out of the loop");


            // Check multiple of 10
        do{
            System.out.println("Enter Number : ");
            int n = sc.nextInt();

            if(n % 10 == 0)
            {
                break;
            }
            System.out.println(n);
        }while(true);
    }
    
}
