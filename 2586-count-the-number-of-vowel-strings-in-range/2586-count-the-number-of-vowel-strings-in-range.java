class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            String s=words[i];
            char c1=s.charAt(0);
            char c2=s.charAt(s.length()-1);
            if("aeiou".indexOf(c1)!=-1 && "aeiou".indexOf(c2)!=-1)
            {
                count++;
            }
        }
        return count;
    }
}