class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int maxcount=0;
        int left=0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
        }
        maxcount=count;
        for(int right=k;right<s.length();right++)
        {
            if(isVowel(s.charAt(right)))
            {
                count++;
            }
             if(isVowel(s.charAt(right-k)))
            {
                count--;
            }
         maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
    public boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        return true;
                
        return false;
    }
}