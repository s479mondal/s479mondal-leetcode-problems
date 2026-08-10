class Solution {
    public int jump(int[] nums) {
        int lend=0;
        int count=0;
        int n=0;
        for(int i=0;i<nums.length-1;i++)
        {
            n=Math.max(n,nums[i]+i);
            if(lend==i)
            {
                count++;
                lend=n;
            }
        }
        return count;
    }
}