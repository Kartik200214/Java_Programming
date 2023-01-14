import java.util.*;
public class InvertedStarPattern 
{
    public static void Pattern(int n){
        
        for(int line = 1; line<=n; line++)
        {
            for(int star = 1;star<=n-line+1;star++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int no = sc.nextInt(); 
        Pattern(no);
    
    }
    
}
