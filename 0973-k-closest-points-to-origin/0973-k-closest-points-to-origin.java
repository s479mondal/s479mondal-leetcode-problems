class Solution {
    public int operation(int a[])
    {
        int x=a[0]*a[0];
        int y=a[1]*a[1];
        return x+y;
    }
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(operation(b)-operation(a)));
       
       for(int[] a:points)
       {
            pq.offer(a);
            if(pq.size()>k)
            {
                pq.poll();
            }
       }
        ArrayList<int[]> list=new ArrayList<>();
       for(int i=0;i<k;i++)
       {
            list.add(pq.poll());
       }
       return list.toArray(new int[list.size()][]);
    }
}