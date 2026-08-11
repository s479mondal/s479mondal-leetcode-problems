class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int lg=g.length;
        int ls=s.length;
        int l1=0,l2=0;
        int count=0;
        while(l1<lg && l2<ls)
        {
            if(g[l1]<=s[l2])
            {
                count++;
                l1++;
                l2++;
            }
            else
            {
                l2++;
            }
        }
        return count;
    }
}