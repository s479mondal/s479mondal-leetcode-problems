class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int[] a=intervals[0];
        int max=0;
        List<int[]> list=new ArrayList<>();
        for(int i=1;i<intervals.length;i++)
        {
            if(a[1]>=intervals[i][0])
            {
                max=Math.max(a[1],intervals[i][1]);
                a[1]=max;
            }
            else
            {
                list.add(a);
                a=intervals[i];
            }
        }
        list.add(a);
        return list.toArray(new int[list.size()][]);
    }
}