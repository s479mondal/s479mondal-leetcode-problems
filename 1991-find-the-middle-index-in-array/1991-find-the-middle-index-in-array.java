class Solution {
    public int findMiddleIndex(int[] nums) {
      int left=0;
        int right=0;
        int sum=0;
        for(int x:nums)
        {
            sum+=x;
        }

        for(int i=0;i<nums.length;i++)
        {
            right=sum-left-nums[i];
            if(right==left)
            {
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}