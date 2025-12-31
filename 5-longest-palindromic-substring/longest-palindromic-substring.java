class Solution {
    public String longestPalindrome(String s)
{
    int start=0;
    int maxlen=0;
    for(int i=0;i<s.length();i++)
    {
        int len1=expand(s,i,i);
        int len2=expand(s,i,i+1);
        int len=Math.max(len1,len2);
        if(len>maxlen)
        {
            maxlen=len;//length of the substring
            start=i-(len-1)/2;//left boundary = center-half value
        }
        
    }
    return s.substring(start,maxlen+start);//start+maxlen->start of the palindrome till the length end.
}
private int expand(String s,int left,int right)
{
    while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
    {
        left--;
        right++;
    }
    return right-left-1;//to get the length of the substring after expanding the boundary.
}
}