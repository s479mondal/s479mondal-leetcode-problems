class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        int a=nums[0];
        int b=nums[1];
        list1.add(a);
        list2.add(b);
        for(int i=2;i<nums.length;i++)
        {
            
            if(a>b)
            {
                list1.add(nums[i]);
                a=nums[i];
            }
            else
            {
                list2.add(nums[i]);
                b=nums[i];
            }
        }
        int[] as=new int[nums.length];
        int c=0;
        for(int n:list1)
        {
            as[c]=n;
            c++;
        }
        for(int n:list2)
        {
            as[c]=n;
            c++;
        }
        return as;
    }
}