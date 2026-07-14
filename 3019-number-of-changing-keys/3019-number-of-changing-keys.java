class Solution {
    public int countKeyChanges(String s) {
        String str=s.toLowerCase();
        int count=0;
        for(int i=0;i<str.length()-1;i++)
        {
            char c1=str.charAt(i);
            char c2=str.charAt(i+1);
            if(c1!=c2)
            {
                count++;
            }
        }
        return count;
    }
}