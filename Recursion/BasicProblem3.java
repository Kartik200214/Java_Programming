// Problem Statement : Print factorial of a number n.

public class BasicProblem3{

   
    public static void main(String arg[])
    {
        int n = 5;
        System.out.println(fact(n)); 
                
    }
    
    public static int fact(int n)
    {
        if( n == 0)//Base case
        {
            return 1;
        }
        
        int Funm1 = fact(n - 1);
        int fn = n * Funm1; 
        return fn;

    }
    
}
