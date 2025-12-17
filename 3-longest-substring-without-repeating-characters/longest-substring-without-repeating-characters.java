class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxlen=0;
        int left=0;
    
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.containsKey(c)&&map.get(c)>=left)
            {
                left=map.get(c)+1;
            }
           map.put(c,i);
                maxlen=Math.max(maxlen,i-left+1);
          
        }
        return maxlen;
    }
}