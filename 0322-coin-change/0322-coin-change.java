class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] a=new int[n+1][amount+1];
        int INF=amount+1;
        for(int i=1;i<=amount;i++)
        {
            a[0][i]=INF;
        }
        for(int i=0;i<=n;i++)
        {
            a[i][0]=0;
        }   
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=amount;j++)
            {
                if(coins[i-1]<=j)
                {
                    a[i][j]=Math.min(a[i-1][j],a[i][j-coins[i-1]]+1);
                }
                else
                {
                    a[i][j]=a[i-1][j];
                }
            }
        }
        return a[n][amount]==INF ? -1: a[n][amount];
    }
}