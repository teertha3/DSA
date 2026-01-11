class Solution {
    public int MinimumCoins(int[] coins, int amount) {
        int n=coins.length;
        int c=0;
        for(int i=n-1;i>=0;i--){
            while(amount>=coins[i]){
                amount-=coins[i];
                c++;
            }
            if(i==0 && amount>0){
                return -1;
            }

        }
        return c;
    }
}


