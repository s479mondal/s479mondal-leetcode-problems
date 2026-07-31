class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int t=nums[i];
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            while(l<r)
            {
                int sum=0;
                List<Integer> temp=new ArrayList<>();
                sum=t+nums[l]+nums[r];
                if(sum==0)
                {
                    temp.add(t);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    while(l<r  && nums[l]==nums[l+1])
                    {
                        l++;
                    }
                    while(l<r && nums[r]==nums[r-1])
                    {
                        r--;
                    }
                    l++;
                    r--;
                    list.add(temp);
                }
                else if(sum>0)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
        }
        return list;
    }
}