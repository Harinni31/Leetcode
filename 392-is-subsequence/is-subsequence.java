class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        if (s.isEmpty()) return true;
        int k=0;
        for(int i=0;i<t.length();i++)
        {
            if(k<s.length() && t.charAt(i)==s.charAt(k) ) 
            {
                k++;
            }
        }
        return (k==s.length())?true:false;
    }
}