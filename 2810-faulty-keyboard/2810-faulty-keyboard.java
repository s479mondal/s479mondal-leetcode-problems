class Solution {
    public String finalString(String s) {

        int last=0;
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='i')
            {
                sb.reverse();
            }
            else
            {
                sb.append(c);
            
            }
        }
        return sb.toString();
    }
}