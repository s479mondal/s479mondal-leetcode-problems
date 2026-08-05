class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        int[] a=new int[n+1];
        for(int p:nums)
        {
            a[p]++;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(a[nums[i]]==2)
            {
                list.add(nums[i]);
                a[nums[i]]--;
            }
        }
        return list;
    }
}