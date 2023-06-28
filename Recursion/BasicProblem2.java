// Problem Statement : Print number from 1 to n(Increasing order)

public class BasicProblem2 {

    public static void printInc(int n)
    {
        if( n == 1)
        {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        
        

    }
    public static void main(String arg[])
    {
        int n = 5;
        printInc(n);
        
    }
    
}
