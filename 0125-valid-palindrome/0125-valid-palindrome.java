class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        s=s.toLowerCase();
        while(left<right)
        {
            char c1=s.charAt(left);
            char c2=s.charAt(right);
            if(!Character.isLetterOrDigit(c1))
            {
                left++;
            }
            else if(!Character.isLetterOrDigit(c2))
            {
                right--;
            }
            else if(c1==c2)
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}