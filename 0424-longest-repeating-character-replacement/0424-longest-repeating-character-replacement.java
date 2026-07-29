class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int max=0;
        int[] f=new int[26];
        int fq=0;
        for(int right=0;right<s.length();right++)
        {
            char c=s.charAt(right);
            f[c-'A']++;
            fq=Math.max(fq,f[c-'A']);
            while((right-left+1)-fq>k)
            {
                c=s.charAt(left++);
                f[c-'A']--;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}