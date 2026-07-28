class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int p=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];
            }
            p=Math.max(p,prices[i]-buy);
        }
        return p;
    }
}