class Solution {
    int operation(int[] rob)
    {
        int ans=0;
        if(rob.length==1)
        {
            return rob[0];
        }
        if(rob.length==2)
        {
            return Math.max(rob[0],rob[1]);
        }

        rob[1]=Math.max(rob[0],rob[1]);
        for(int i=2;i<rob.length;i++)
        {
            rob[i]=Math.max(rob[i-1],rob[i]+rob[i-2]);
        }
        return rob[rob.length-1] ;
    }
    public int rob(int[] nums) {
        int[] r1=new int[nums.length-1];
        int[] r2=new int[nums.length-1];
        if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++)
        {
            r1[i]=nums[i];
        }
        for(int i=0;i<nums.length-1;i++)
        {
            r2[i]=nums[i+1];
        }
        return Math.max(operation(r1),operation(r2));
    }
}