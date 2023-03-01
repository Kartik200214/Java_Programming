import java.util.*;

public class Program5
{
    public  static void insertionSort(int arr[])
    {
        for(int i = 1;i<arr.length; i++)
        {
            int curr = arr[i];
            int prev = i-1;
            //Finding out the correct pos to insert
            while(prev >= 0 && arr[prev] > curr)
            {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //Insertion
            arr[prev + 1] = curr;
        }
    }

    public static void PrintArr(int arr[])
    {
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String arg[])
    {
        int arr[] = {5,4,2,1,3};
        insertionSort(arr);
        PrintArr(arr);
    }
}