//// Problem Statement : Write a function to find the first occurence of an element in an array.

class ProblemNo7
{
    public static int firstOccurence(int arr[],int key ,int i)
    {
        if(i==arr.length)
        {
            return -1; 
        }

        if(arr[i]==key)        
        {
            return i;
        } 

        return firstOccurence(arr, key, i+1);

    }

    public static void main(String arg[])
    {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.err.println(firstOccurence(arr, 5, 0));

    }
}

//Time Complexity : O(n)
//space Complexity : O(n)
