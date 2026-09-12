class Solution {
    public int numMagicSquaresInside(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int count = 0;

        for(int i = 0; i <= n - 3; i++)
        {
            for(int j = 0; j <= m - 3; j++)
            {
                // Center must be 5
                if(grid[i+1][j+1] != 5)
                {
                    continue;
                }

                // Check numbers 1 to 9 exactly once
                boolean[] seen = new boolean[10];
                boolean valid = true;

                for(int r = i; r < i + 3; r++)
                {
                    for(int c = j; c < j + 3; c++)
                    {
                        int num = grid[r][c];

                        if(num < 1 || num > 9 || seen[num])
                        {
                            valid = false;
                            break;
                        }

                        seen[num] = true;
                    }

                    if(!valid)
                        break;
                }

                if(!valid)
                    continue;

                // Check all 3 rows
                for(int r = i; r < i + 3; r++)
                {
                    int sum = grid[r][j] 
                            + grid[r][j+1] 
                            + grid[r][j+2];

                    if(sum != 15)
                    {
                        valid = false;
                        break;
                    }
                }

                if(!valid)
                    continue;

                // Check all 3 columns
                for(int c = j; c < j + 3; c++)
                {
                    int sum = grid[i][c] 
                            + grid[i+1][c] 
                            + grid[i+2][c];

                    if(sum != 15)
                    {
                        valid = false;
                        break;
                    }
                }

                if(!valid)
                    continue;

                // First diagonal
                int dsum1 = grid[i][j]
                          + grid[i+1][j+1]
                          + grid[i+2][j+2];

                if(dsum1 != 15)
                    continue;

                // Second diagonal
                int dsum2 = grid[i+2][j]
                          + grid[i+1][j+1]
                          + grid[i][j+2];

                if(dsum2 != 15)
                    continue;

                count++;
            }
        }

        return count;
    }
}