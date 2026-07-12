class Solution {
    public String sortVowels(String s) {
        ArrayList<Integer> list=new ArrayList<>();
        Set<Character> set=new HashSet<>();
        set.add('a');
         set.add('e');
          set.add('i');
           set.add('o');
            set.add('u');
        set.add('A');
         set.add('E');
          set.add('I');
           set.add('O');
            set.add('U');
        for(int i=0;i<s.length();i++)
        {
            if(set.contains(s.charAt(i)))
            {
                list.add((int)s.charAt(i));
            }
        }
        Collections.sort(list);
        StringBuilder st=new StringBuilder();
        for(int i=0;i<list.size();i++)
        {
            st.append((char)(int)list.get(i));
        }
        String t="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                t+=s.charAt(i);
            }
            else
            {
                t+=st.charAt(count++);
            }
        }
        return t;
    }
}