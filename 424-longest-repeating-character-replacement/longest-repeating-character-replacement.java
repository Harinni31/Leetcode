class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq=0;
        int[] freq=new int[26];
        int maxlen=0;
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            freq[s.charAt(right)-'A']++;
              maxfreq=Math.max(maxfreq,freq[s.charAt(right)-'A']);
             int windowlen=right-left+1;
        
            if(windowlen-maxfreq>k)
            {
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}