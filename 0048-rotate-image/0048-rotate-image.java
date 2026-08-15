class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
     
        int left=0;
        int right=n-1;
        int l=0;
        int r=n-1;
        while(left<=right)
        {
            l=0;
            r=n-1;
            while(l<=r)
            {
                int t=matrix[left][r];
                matrix[left][r]=matrix[left][l];
                matrix[left][l]=t;
                l++;
                r--;
            }
            left++;
        }
    }
}