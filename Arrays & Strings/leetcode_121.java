//Best time to buy and sell stocks
class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0,min_price=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min_price){
                min_price=prices[i];
            }
            else if(max_profit< prices[i]-min_price){
                max_profit=prices[i]-min_price;
            }
        }
        return max_profit;
    }
}
