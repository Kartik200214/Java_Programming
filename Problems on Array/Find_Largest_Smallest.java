import java.util.*;

public class Find_Largest_Smallest
{
    public static int getLargest(int numbers[])
    {
        int largest = Integer.MIN_VALUE;  // - INFINITY
        int Smallest = Integer.MAX_VALUE;

        for(int i = 0;i< numbers.length;i++)
        {
            if(largest < numbers[i])
            {
                largest = numbers[i];
            }
            if(Smallest > numbers[i])
            {
                Smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : "+Smallest);
        return largest;
        
    }
    public static void main(String args[])
    {

        int numbers[] = {1,4,12,3,5,6};
        int largest = getLargest(numbers);

        System.out.println("Largest number is : "+largest);

    }
    
}
