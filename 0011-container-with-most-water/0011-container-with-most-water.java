class Solution {
    public int maxArea(int[] height) {
       int h=Integer.MIN_VALUE;
       int len=Integer.MIN_VALUE;
       int left=0;
       int right=height.length-1;
       h=Math.min(height[left],height[right]);
       len=Math.max(len,h*(right-left));
       while(left<right)
       {
            if(height[left]>height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
            h=Math.min(height[left],height[right]);
            len=Math.max(len,h*(right-left));
       }
       return len;
    }
}