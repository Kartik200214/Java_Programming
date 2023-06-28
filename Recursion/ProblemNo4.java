// Problem Statement : Print Nth fibonacci number.
// 0    1    1   2   3   5   8   13  21...
// Time Complexity = O(2^n)

class ProblemNo4
{
    public static int fibo(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        
        int fnm1 = fibo(n-1);
        int fnm2 = fibo(n-2);
        int fn = fnm1 + fnm2;
        return fn;
         
    }

    public static void main(String arg[])
    {
        int n = 28;
        System.out.print(fibo(n));

    }
}
