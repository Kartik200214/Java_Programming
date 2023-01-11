//1_ Java automatically promotes each byte,short or char operand to int when evaluation an expression.

//2_ If one operand is  long ,float or double the whole expression is promoted to long float or double respectively.

public class TypePromotion // Type Promotion in Expressions
{
    public static void main(String arg[])
    {
        char a = 'a'; // 97
        char b = 'b';   // 98
        int c = a - b;

        System.out.println(c);

        short d = 5;
        byte  e = 25;
        char f = 'c';
        byte bt = (byte)(d + e + f);
        System.out.println(bt);
        
    }
    
}
