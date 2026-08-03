class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int h=Math.min(height[l],height[r]);
        int max=0;
        max=Math.max(max,h*(r-l));
        while(l<r)
        {
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
            h=Math.min(height[l],height[r]);
            max=Math.max(max,h*(r-l));
        }
        return max;
    }
}