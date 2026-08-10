class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0;
        int t=0;
        int b=0;
        for(int i=0;i<bills.length;i++)
        {
            int n=bills[i];
            if(n==5)
            {
                f++;
            }
            else if(n==10)
            {
                if(f<1)
                {
                    return false;
                }
                f--;
                t++;
            }
            else if(n==20)
            {
                if((f<1) || (f<=2 && t<1))
                {
                    return false;
                }
                if(t>=1 && f>0)
                {
                    f--;
                    t--;
                }
                else if(f>=3)
                {
                    f-=3;
                }
                b++;
            }
        }
        return true;
    }
}