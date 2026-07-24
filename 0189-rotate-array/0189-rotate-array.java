class Solution {
    void operation(int[] a, int l, int r)
    {
        while(l<r)
        {
            int t=a[l];
            a[l]=a[r];
            a[r]=t;
            l++;
            r--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k% nums.length;
        operation(nums,0,nums.length-k-1);
        // for(int i=0;i<nums.length;i++)
        // {
        //     System.out.print(nums[i]+", ");
        // }
        operation(nums,nums.length-k,nums.length-1);
   
        operation(nums,0,nums.length-1);
    }
}