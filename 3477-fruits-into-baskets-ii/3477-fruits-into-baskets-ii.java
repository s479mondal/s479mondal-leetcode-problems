class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int c=0;
        for(int n:fruits)
        {
            boolean s=false;
            for(int i=0;i<baskets.length;i++)
            {
                if(baskets[i]>=n)
                {
                    baskets[i]=-1;
                    s=true;
                    break;
                }
            }
            if(!s)
            {
                c++;
            }
        }
        return c;
    }
}