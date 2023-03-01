import java.util.*;

public class Program3
{
    public  static void bubbleSort(int arr[])
    {
        int swap = 0;//<<<<<<<<<<
        for(int turn = 0;turn<arr.length -1;turn++)
        {
            for(int j=0;j<arr.length-1-turn;j++,swap++) 
            {
                if(swap == 0)
                {
                    System.out.println("Array is sorted"); // if array is sorted then it can loop can only run 1 times
                }
                if(arr[j] > arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap ++; //<<<<<<
                }
                
            }
           
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
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        PrintArr(arr);
    }
}