class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            sum=target-nums[i];
            if(map.containsKey(sum))
            {
                return new int[]{map.get(sum),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}