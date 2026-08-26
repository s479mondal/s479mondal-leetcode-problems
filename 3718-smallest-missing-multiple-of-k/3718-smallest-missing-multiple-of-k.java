class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%k==0)
            {
                set.add(nums[i]);
            } 
        }
        int i=1;
        int n=0;
        while(true)
        {
            n=k*i;
            if(!set.contains(n))
            {
                break;
            }
            i++;
        }
        return n;
    }
}