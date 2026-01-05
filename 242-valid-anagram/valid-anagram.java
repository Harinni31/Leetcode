class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }
        for(char c:t.toCharArray())
        {
          /*  if(freq[c-'a']==0)
            {
                return false;
            }
            */
            freq[c-'a']--;
        }
        for(int num:freq)
        {
            if(num!=0)
            {
                return false;
            }
        }

        return true;
    }
}