class Solution {
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int[][] a=new int[n1+1][n2+1];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=n1;i++)
        {
            a[i][0]=i;
        }
        for(int i=1;i<=n2;i++)
        {
            a[0][i]=i;
        }
        a[0][0]=0;
        for(int i=1;i<=n1;i++)
        {
            for(int j=1;j<=n2;j++)
            {
                if(word1.charAt(i-1)!=word2.charAt(j-1))
                {
                    a[i][j]=Math.min(a[i-1][j-1],Math.min(a[i-1][j],a[i][j-1]))+1;
                }
                else
                {
                    a[i][j]=a[i-1][j-1];
                }
            }
        }
        return a[n1][n2];
    }
}