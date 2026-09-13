class Solution {
    public String reverseVowels(String s) {
        int low=0;
        int high=s.length();
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('o');
        set.add('O');
        set.add('u');
        set.add('U');
        char lc;
        char rc;
        boolean lf=false;
        boolean rf=false;
        char[] a=new char[high];
        while(low<high)
        {
            char l=s.charAt(low);
            char r=s.charAt(high-1);
            
            if(set.contains(l))
            {
                lf=true;
                lc=l;  
            }
            else if(!lf)
            {
                a[low]=l;
                low++;
            }
            if(set.contains(r))
            {
                rf=true;
                rc=r;
            }
            else if(!rf)
            {
                a[high-1]=r;
                high--;
            }

            if(lf && rf)
            {
                rf=false;
                lf=false;
                
                a[low]=r;
                a[high-1]=l;
                low++;
                high--;
            }
        }
        return new String(a);
    }
}