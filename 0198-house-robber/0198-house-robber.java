class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[1],nums[0]);
        int a=nums[0];
        int b=nums[1];
        nums[1]=Math.max(a,b);
        for(int i=2;i<nums.length;i++){
            nums[i]=Math.max((nums[i]+nums[i-2]),(nums[i-1]));
        }
        return nums[nums.length-1];
    }
}