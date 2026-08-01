class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int[] m=intervals[0];
        for(int[] a: intervals)
        {
            if(a[0]<=m[1])
            {
                m[1]=Math.max(a[1],m[1]);
            }
            else
            {
                list.add(m);
                m=a;
            }
        }   
        list.add(m);
        return list.toArray(new int[list.size()][]);
    }
}