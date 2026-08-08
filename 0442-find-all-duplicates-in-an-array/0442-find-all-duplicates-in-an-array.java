class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int[] a=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]]++;
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