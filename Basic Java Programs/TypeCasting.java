import java.util.*;

public class TypeCasting {  // narrowing conversion
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);
        float a = 25.19899f; // Date lossing

        // int b = a;  // Not possible ( Error )

        int b = (int) a;

        System.out.println(b);

        char ch = 'a'; // Type casting(char to charcter so print ascii value)
        int ch2 =  'b';

        int number = ch;
        System.out.println(number);


    }
    
}
/*
  Conversions happends when:
    1.type compatible ( widening or  implicit conversion all are same )
    2.destination type > source type 

    byte->short->int->float->long->double
 */
