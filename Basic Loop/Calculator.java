import java.util.*;

public class Calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int iNo1 = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int iNo2 = sc.nextInt();
        System.out.println("Enter operator : ");
        char operator = sc.next().charAt(0);

        switch(operator)
        {
            case '+' : System.out.println(iNo1 + iNo2);
                        break;
            case '-' : System.out.println(iNo1 - iNo2);
                        break;
            case '*' : System.out.println(iNo1 * iNo2);
                        break;
            case '/' : System.out.println(iNo1 / iNo2);
                        break;
            case '%' : System.out.println(iNo1 % iNo2);
                        break;
            default  : System.out.println("Wrong Operator");
        }


    }
}
