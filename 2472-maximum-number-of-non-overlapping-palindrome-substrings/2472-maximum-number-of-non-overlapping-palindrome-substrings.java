class Solution {
    
    public boolean isPalindrom(String s, int i, int j)
    {
        while(i<j)
        {
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(c1==c2)
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public int solve(String s,int[][] a, int k, int i, int j)
    {
        if(i>= s.length() || j>=s.length())
        {
            return 0;
        }
        if(a[i][j]!=-1)
        {
            return a[i][j];
        }
        if(isPalindrom(s,i,j))
        {
            int take=1+solve(s,a,k,j+1,j+k);
            int grow=solve(s,a,k,i,j+1);
            int slide=solve(s,a,k,i+1,j+1);
            return a[i][j]=Math.max(take,Math.max(grow,slide));
        }
        int t=solve(s,a,k,i,j+1);
        int sl=solve(s,a,k,i+1,j+1);
        return a[i][j]=Math.max(t,sl);
    }
    public int maxPalindromes(String s, int k) {
        int n=s.length();
        if(k==1)
        {
            return n;
        }
        int[][] a=new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(a[i],-1);
        }
        return solve(s,a,k,0,k-1);
    }
}