//// Problem Statement : Write a function to find the last occurence of an element in an array.

class ProblemNo8
{
    public static int lastOccurence(int arr[],int key ,int i)
    {
        if(i == arr.length)
        {
            return -1; 
        }
        int isFound = lastOccurence(arr, key, i+1);
        
        if(isFound == -1 && arr[i] == key)
        {
            return i;
        }
        return isFound;

    }

    public static void main(String arg[])
    {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.err.println(lastOccurence(arr, 5, 0));

    }
}

//Time Complexity : O(n)
//space Complexity : O(n)