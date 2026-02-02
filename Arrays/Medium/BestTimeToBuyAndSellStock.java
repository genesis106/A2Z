package A2Z.Arrays.Medium;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min=prices[0],profit=0, n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                profit=Math.max(profit, prices[i]-min);
            }
        }return profit;
    }
}
