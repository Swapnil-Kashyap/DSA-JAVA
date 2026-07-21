import java.util.*;
public class Arrayassignment2 {
    public static int maxprofit (int[] prices){
        int buy = prices[0];
        int profit = 0;
         
        for(int i=1;i<prices.length;i++){
            if (buy < prices[i]){
                profit = Math.max(prices[i]-buy,profit);

                 {
                    buy=prices[i];
                }
            }
        }
        return profit;
    }
    public static void main (String [] args){
        int prices [] = {1,4,37,7,9,7};
        System.out.println(maxprofit (prices));
    }
}
