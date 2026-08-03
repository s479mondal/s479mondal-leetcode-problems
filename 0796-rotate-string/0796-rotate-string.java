class Solution {
    public boolean rotateString(String s, String goal) {
        String st=s+s;
        if(s==goal)
        {
            return true;
        }
        if(s.length()!=goal.length())
        {
            return false;
        }
        return st.contains(goal);
    }
}