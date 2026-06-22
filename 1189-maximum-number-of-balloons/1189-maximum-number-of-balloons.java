class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] f=new int[26];
        for(int i=0;i<text.length();i++)
        {
            char c=text.charAt(i);
            f[c-'a']++;
        }
        return Math.min(Math.min(f['b'-'a'],f['a'-'a']),Math.min(f['l'-'a']/2,Math.min(f['o'-'a']/2,f['n'-'a'])));
    }
}