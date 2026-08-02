class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        List<int[]> list=new ArrayList<>();
        int[] a=intervals[0];
        for(int[] n:intervals)
        {
            if(a[1]>=n[0])
            {
                a[1]=Math.max(a[1],n[1]);
            }
            else
            {
                list.add(a);
                a=n;
            }
        }
        list.add(a);
        return list.toArray(new int[list.size()][]);
    
    }
}