class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a=0;
        int b=0;
        int c=0;
        for(int i=cost.length-1;i>=0;i--){
            c=cost[i]+Math.min(a,b);
            a=b;
            b=c;

        }
        return Math.min(a,b);
    }
}