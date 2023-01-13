class RelationalOperator
{
    public static void main(String args[]) 
    {
        int A = 10;
        int B = 5;

        System.out.println(A == B);
        
        System.out.println(A != B);
        
        System.out.println(A > B);
        
        System.out.println(A < B);
        
        System.out.println(A >= B);

        System.out.println((5 > 3)  && (6 > 3 ));    // Logical operator

        System.out.println((6 < 3)  && (6 > 4));     // Logical operator

        System.out.println((5 > 3)  || (6 < 3 ));    // Logical operator

        System.out.println((5 > 3)  && (6 > 3 ));    // Logical operator

        // A = A + 10;

        A += 10; // Assignment Operator

        B -= 3; 
        
        System.out.println(A);
        System.out.println(B);



    }
}