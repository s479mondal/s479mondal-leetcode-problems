class Solution {
    public boolean operation(int[] nums,int sum)
    {
        int n=nums.length;
        boolean[][] a=new boolean[n+1][sum+1];

        for(int i=0;i<=n;i++)
        {
            a[i][0]=true;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(nums[i-1]<=j)
                {
                    a[i][j]=a[i-1][j-nums[i-1]] || a[i-1][j];
                }
                else
                {
                    a[i][j]=a[i-1][j];
                }
            }
        }
        return a[n][sum];
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n:nums)
        {
            sum+=n;
        }      
        if(sum%2!=0)
        {
            return false;
        }
        return operation(nums,sum/2);
    }
}