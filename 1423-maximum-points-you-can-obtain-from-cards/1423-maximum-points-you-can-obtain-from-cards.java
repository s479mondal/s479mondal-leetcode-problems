class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            sum+=cardPoints[i];
        }
        int left=k-1;
        max=sum;
        for(int i=cardPoints.length-1;i>=cardPoints.length-k;i--)
        {
            sum+=cardPoints[i]-cardPoints[left--];
            max=Math.max(max,sum);
        }
        return max;
    }
}