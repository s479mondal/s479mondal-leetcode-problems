class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        Integer[] a=new Integer[nums.length];
        for(Integer i=0;i<nums.length;i++)
        {
            a[i]=nums[i];
        }
        Arrays.sort(a, (x,y) -> {

            if(map.get(x)==map.get(y))
            {
                return y-x;
            }
            else
            {
                return map.get(x)-map.get(y);
            }
        });
        int[] s=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            s[i]=a[i];
        }
        return s;
    }
}