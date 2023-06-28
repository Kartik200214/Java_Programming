//// Problem Statement : Print sum of first n natural numbers.

class ProblemNo5
{
    public static int calcSum(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        int Snm1 = calcSum(n-1); 
        int sum  = n + Snm1;
        return sum;

    }

    public static void main(String arg[])
    {
        int n = 5;
        int Ret = calcSum(n);

        System.out.print("Addtion is: "+Ret);

    }
}
