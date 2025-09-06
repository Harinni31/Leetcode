class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int maxlen=0;
        Set<Character> set=new HashSet<>();
        while(end<s.length())
        {
            if(!set.contains(s.charAt(end)))
            {
                set.add(s.charAt(end));
                maxlen=Math.max(maxlen,end-start+1);
                end++;
            }
            else
            {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxlen;        
    }
}