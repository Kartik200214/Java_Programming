// Problem Statement : Print number from n to 1(Decreasing order)

class RecursionBasic
{
    public static void printDec(int n)
    {
        if(n==1)
        {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String arg[])
    {
        int n = 10;
        printDec(n);

    }
}
