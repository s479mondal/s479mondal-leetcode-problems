class Solution {
    public boolean checkDivisibility(int n) {
        int t=n;
        int sum=0;
        int p=1;
        while(t>0)
        {
            int r=t%10;
            sum+=r;
            p*=r;
            t/=10;
        }
        // System.out.print(sum);
        if(n%(sum+p)==0)
        {
            return true;
        }
        return false;
    }
}