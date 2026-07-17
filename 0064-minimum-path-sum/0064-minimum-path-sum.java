class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int rsum=0;
        int csum=0;
        for(int i=1;i<n;i++)
        {
            rsum=grid[0][i-1];
            grid[0][i]+=rsum;
        }
        for(int i=1;i<m;i++)
        {
            csum=grid[i-1][0];
            grid[i][0]+=csum;
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                grid[i][j]+=Math.min(grid[i][j-1],grid[i-1][j]);
            }
        }
        return grid[m-1][n-1];

    }
}