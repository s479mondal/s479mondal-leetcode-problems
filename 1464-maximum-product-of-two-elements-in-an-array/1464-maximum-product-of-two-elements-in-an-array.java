class Solution {
    public int maxProduct(int[] nums) {
        int fmax=0;
        int smax=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>fmax)
            {
                smax=fmax;
                fmax=nums[i];
            }
            else if(nums[i]>smax)
            {
                smax=nums[i];
            }
        }

        return (fmax-1)*(smax-1);
    }
}