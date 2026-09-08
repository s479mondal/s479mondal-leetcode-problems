class Solution {
    public ArrayList<Integer> bfs(int node, List<List<Integer>> adj, boolean[] vis)
    {
        int n=0;
        int e=0;
        int totalEdge=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        while(!q.isEmpty())
        {
            node=q.poll();
            n++;
            e+=adj.get(node).size();
            for(int it:adj.get(node))
            {
                if(!vis[it])
                {
                
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        totalEdge=e/2;
        n=n*(n-1)/2;
        list.add(totalEdge);
        list.add(n);
        return list;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] it:edges)
        {
            adj.get(it[0]).add(it[1]);
            adj.get(it[1]).add(it[0]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                
                vis[i]=true;
                list=bfs(i,adj,vis);
                int a=list.remove(0);
                int b=list.remove(0);
                if(a==b)
                {
                    count++;
                }
            }
        }
        return count;
    }
}