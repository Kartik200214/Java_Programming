
// variable = condition?statement1:statement2;

public class TernaryOperator
{
    public static void main(String arr[])
    {
        int number = 65;

        // ternary operator
        String type = ((number%2) == 0)?"even":"odd";
        System.out.println(type);

        String report = (number >= 33)?"Pass":"Fail";
        System.out.println(report);

    }

    
}
