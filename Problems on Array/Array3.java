
public class Array3
{
    public static int binarySearch(int numbers[],int key)
    {
        
        int start = 0,end = numbers.length -1;

        while(start <= end)
        {
            int mid = (start + end) / 2;

            //comparisons
            if(numbers[mid] == key)  // Found
            {
                return mid;
            }
            if(numbers[mid] < key) // right
            {
                start = mid + 1;
            }
            else // left
            {
                end = mid - 1; 
            }
             
        }
        return -1;
        
    }
    public static void main(String args[])
    {
        int numbers[] = {2,4,6,8,10,12,14,18,20};
        int key = 6;

        System.out.println("Index for key is : "+binarySearch(numbers, key));

     

    }

    
}
