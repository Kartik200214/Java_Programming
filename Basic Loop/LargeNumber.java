import java.util.*;

public class LargeNumber
{
    public static void main(String args[])
    {
        System.out.println("Enter Three Number :");
        Scanner sc = new Scanner(System.in);

        int iNo1 = sc.nextInt();
        int iNo2 = sc.nextInt();
        int iNo3 = sc.nextInt();

        if(iNo1 > iNo2 && iNo1 > iNo3)
        {
            System.out.println("Larger Number is : "+iNo1);
        }
        else if(iNo2 > iNo3)
        {
            System.out.println("Large Number is : "+iNo2);
        }
        else 
        {
            System.out.println("Large Number is : "+iNo3);
        }


    }

}
    
