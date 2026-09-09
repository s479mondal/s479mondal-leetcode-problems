class Solution {
    public void operation(char[][] grid, int i, int j)
    {
        int row=grid.length;
        int col=grid[0].length;

        if(i <0 || i>=row || j<0 || j>=col)
        {
            return ;
        }        
        if(grid[i][j]=='0')
        {
            return;
        }
        grid[i][j]='0';
        operation(grid,i-1,j);
        operation(grid,i+1,j);
        operation(grid,i,j-1);
        operation(grid,i,j+1);
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    operation(grid, i, j );
                }
            }
        }
        return count;
    }
}

