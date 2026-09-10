class Solution {
    public String makeGood(String s) {
        int left=0;
        int right=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(sb.length()>0)
            {
                char c=sb.charAt(sb.length()-1);
                char r=s.charAt(i);
                if(Math.abs(c-r)==32)
                {
                    sb.deleteCharAt(sb.length()-1);
                    continue;
                }

            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}