public class KadanesAlgo {

    public static void kadanes(int numbers[])
    {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0;i<numbers.length;i++)
        {
            currSum = currSum + numbers[i];
            if(currSum < 0)
            {
                currSum = 0;
    
            }
            maxSum = Math.max(currSum, maxSum);

        }
        System.out.println("our max subarray sum is : "+ maxSum);
    

    }
    public static void main(String args[])
    {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);

    }
}

/* 

int size = n;
int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

for (int i = 0; i < size; i++) {
    max_ending_here = max_ending_here + arr[i];
    if (max_so_far < max_ending_here)
        max_so_far = max_ending_here;
    if (max_ending_here < 0)
        max_ending_here = 0;
}
return max_so_far;

*/