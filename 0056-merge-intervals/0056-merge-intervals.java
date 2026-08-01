class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int[] a: intervals)
        {
            if(list.isEmpty() || list.get(list.size()-1).get(1)<a[0])
            {
                list.add(new ArrayList<>(Arrays.asList(a[0],a[1])));
            }
            else
            {
                int last=list.size()-1;
                int max=Math.max(list.get(last).get(1),a[1]);
                list.get(last).set(1,max);
            }
        }
        int[][] ans=new int[list.size()][2];
        for(int i=0;i<list.size();i++)
        {
            ans[i][0]=list.get(i).get(0);
            ans[i][1]=list.get(i).get(1);
        }
        return ans;
    }
}