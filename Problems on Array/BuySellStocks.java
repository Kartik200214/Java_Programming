import java.util.*;

public class BuySellStocks {
    

    public static int buyAndSellStocks(int prices[])
    {
        int buyPrices =Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0;i<prices.length;i++)
        {
            if(buyPrices < prices[i]) // Profit
            {
                int profit = prices[i] - buyPrices; // today's profit
                maxProfit = Math.max(maxProfit,profit);
            }
            else
            {
                buyPrices = prices[i];
            }
        }
        return maxProfit;

    }

    public static void main(String arg[])
    {
        int prices[] = {7,1,5,3,8,4};
        System.out.println("Maximum profit = "+buyAndSellStocks(prices));
    }
}
