class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] a=new int[n+1][m+1];
        for(int i=0;i<n;i++)
        {
            a[i][0]=0;
        }
        for(int i=0;i<m;i++)
        {
            a[0][i]=0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    a[i][j]=1+a[i-1][j-1];
                }
                else
                {
                    a[i][j]=Math.max(a[i-1][j],a[i][j-1]);
                }
            }
        }
        return a[n][m];
    }
}