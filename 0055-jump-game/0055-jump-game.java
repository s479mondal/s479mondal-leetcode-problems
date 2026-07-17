class Solution {
    public boolean canJump(int[] nums) {
        int cj=nums[0];
        for(int i=1;i<nums.length;i++){
            if(i>cj) return false;
            cj=Math.max(cj,nums[i]+i);
        }
        return true;
    }
}