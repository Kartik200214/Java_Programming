public class TrappedWater {
    public static int trapedRainwater(int height[])
    {
        int n = height.length;
        //calculate left max boundary - Auxiliaryarray(Helper)
        int leftMax[] = new int [n];
        leftMax[0] = height[0];
        for(int i =1;i<n;i++)
        {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        
        // calculate right max boundary - array
        int rightMax[]=new int [n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--)
        {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedwater =0; 
        //loop
        for(int i = 0;i<n;i++)
        {
            // waterLevel = min(leftmax boundary,rightmax boundary)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            // trapped water = waterLevel - height[i]
            trappedwater += waterLevel -height[i];
        }
        return trappedwater;
        
    }

    public static void main(String arg[])
    {
        int height[] = {4,2,0,6,3,2,5};
        
        System.out.print( "Water trap after raining = "+trapedRainwater(height));
    }
    
}
