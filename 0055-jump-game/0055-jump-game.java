class Solution {
    public boolean canJump(int[] nums) {
        int n=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(i>n)
            {
                return false;
            }
            n=Math.max(n,nums[i]+i);
        }
        return true;
    }
}