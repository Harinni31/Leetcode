class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int org=x;
        int rev=0;
        while(0<org)
        {
           int n=org%10;
           rev=rev*10+n;
           org=org/10;
        }
        return x==rev;
    }
}