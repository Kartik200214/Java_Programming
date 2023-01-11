import java.util.Scanner;

public class AreaOfCircle 
{
    public static void main(String arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter radius of Circle: ");
        float radius = sobj.nextFloat();

        float Area = 3.14f * radius * radius;

        System.out.println("Area of circle is "+Area);

    }
    
}
