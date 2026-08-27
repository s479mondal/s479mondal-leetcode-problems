class Solution {
    public int operation(int[] arr, int sum)
    {
        int n=arr.length;
        int[][] a=new int[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            a[i][0]=1;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(arr[i-1]<=j)
                {
                    a[i][j]=a[i-1][j]+a[i-1][j-arr[i-1]];
                }
                else
                {
                    a[i][j]=a[i-1][j];
                }
            }
        }
        return a[n][sum];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int n:nums)
        {
            sum+=n;
        }
        if((sum+target)<0 || (sum+target)%2!=0)
        {
            return 0;
        }
        return operation(nums,(sum+target)/2);
    }
}