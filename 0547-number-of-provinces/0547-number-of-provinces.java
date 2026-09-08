class Solution {
    public void dfs(int node, int[][] a, boolean[] vis,int v)
    {
        vis[node]=true;
        for(int i=0;i<v;i++)
        {
            if(a[node][i]==1 && !vis[i])
            {
                dfs(i,a,vis,v);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int v=isConnected.length;
        boolean[] vis=new boolean[v];
        int count=0;
        for(int i=0;i<v;i++)
        {
            
            if(!vis[i])
            {
                vis[i]=true;
                count++;
                dfs(i,isConnected,vis,v);
            }
        }
        return count;
    }
}