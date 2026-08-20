class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=-1;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(k==1)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(map.get(nums[i])==1)
                {
                    max=Math.max(max,nums[i]);
                }
            }
            return max;
        }
        else if(k==nums.length)
        {
            for(int i=0;i<nums.length;i++)
            {
                max=Math.max(max,nums[i]);
            }
            return max;
        }

        if(map.get(nums[0])==1)
        {
           max=Math.max(max,nums[0]);
        }
        if(map.get(nums[nums.length-1])==1)
        {
           max=Math.max(max,nums[nums.length-1]);
        }
        return max==-1?-1:max;
    }
}