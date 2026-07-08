class Solution {
    public boolean validPalindrome(String s) {
       // 
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
       if(s.charAt(left)!=s.charAt(right))
       {
        return (isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1))?true:false;
   
       }
       left++;
       right--;
        }
       return true;
    }
    private static boolean isPalindrome(String s,int left,int right)
    {
        char[] c=s.toCharArray();
        while(left<right)
        {
            if(c[left]!=c[right]) return false;
            left++;
            right--;
            }
       return true;
    }

}