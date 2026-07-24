class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character, Character> map1=new HashMap<>();
        HashMap<Character, Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char s1=s.charAt(i);
            char s2=t.charAt(i);
            if(map1.containsKey(s1))
            {
                if(map1.get(s1)!=s2)
                {
                    return false;
                }
            }
            else
            {
                map1.put(s1,s2);
            }



            if(map2.containsKey(s2))
            {
                if(map2.get(s2)!=s1)
                {
                    return false;
                }
            }
            else
            {
                map2.put(s2,s1);
            }
        }
        return true;
    }
}