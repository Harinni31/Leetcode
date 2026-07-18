class Solution {
    private static boolean isVowel(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
        {
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int count=0;
        
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
        }
        int maxlen=count;
        if (s.length()==k) return maxlen;
        for(int i=k;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
                   if(isVowel(s.charAt(i-k)))
            {
                count--;
            }
            maxlen=Math.max(maxlen,count);
        }











   /*     int maxvowels=0;
        int winv=0;
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for(int i=0;i<k;i++)
        {
            if(set.contains(s.charAt(i)))
            {
                winv++;
            }
        }
        maxvowels=winv;
        for(int i=k;i<s.length();i++)
        {
            if(set.contains(s.charAt(i)))
            {
                winv++;
            }
            if(set.contains(s.charAt(i-k)))
            {
                winv--;
            }
            maxvowels=Math.max(maxvowels,winv);
        }
        return maxvowels;*/
    return maxlen;
    }
}