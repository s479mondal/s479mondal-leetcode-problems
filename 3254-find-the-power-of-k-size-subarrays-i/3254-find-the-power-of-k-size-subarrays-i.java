class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int max=0;
        int t=-1;
        ArrayList<Integer> list=new ArrayList<>();
        int left=0;
        int consecutive=0;
        for(int right=0;right<nums.length;right++)
        {
            if( right>0 && nums[right]==nums[right-1]+1)
            {
                consecutive++;
            }
            else
            {
                consecutive=1;
            }
            
            if(right>=k-1)
            {
                if(consecutive>=k)
                {
                    list.add(nums[right]);
                }
                else
                {
                    list.add(-1);
                }
            }
        } 
        int[] a=new int[list.size()];
        k=0;
        for(int n:list)
        {
            a[k]=n;
            k++;
        }
    return a;
    }
}