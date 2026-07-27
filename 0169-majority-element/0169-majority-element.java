class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int common=0;
        for(int n:nums)
        {
            if(count==0)
            {
                common=n;
            }


            if(common==n)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return common;
    }
}