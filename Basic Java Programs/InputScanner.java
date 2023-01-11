import java.util.*;

class InputScanner 
{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number");
        int iNo1 = sc.nextInt();

        System.out.println("Enter second Number");
        int iNo2 = sc.nextInt();

        int isum = iNo1 + iNo2;

        System.out.println("Addition of Number: "+ isum);

        
    }
    
}
