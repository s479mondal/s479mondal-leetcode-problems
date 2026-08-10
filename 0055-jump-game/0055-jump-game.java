class Solution {
    public boolean canJump(int[] nums) {
        int s=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(s<i)
            {
                return false;
            }
            s=Math.max(s,nums[i]+i);
        }
        return true;
    }
}