class Solution {
    public int climbStairs(int n) {
        int b=2;
        if(n<=2)
        {
            return n;
        }
        int count=0;
        int a=1;
        int t=0;
        for(int i=2;i<n;i++)
        {
            t=b;
            b=a+b;
            a=t;
        }
        return b;
    }
}