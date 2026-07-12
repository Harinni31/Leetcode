class Solution {
    public String minWindow(String s, String t) {
        //need,window,required,formed
        HashMap<Character,Integer>need=new HashMap<>();
        HashMap<Character,Integer>window=new HashMap<>();
       
        int formed=0;
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;
        for(char c:t.toCharArray())
        {
            need.put(c,need.getOrDefault(c,0)+1);
        }
         int required=need.size();
        for(int right=0;right<s.length();right++)
        {
            char c=s.charAt(right);//formed == required then move left
            window.put(c, window.getOrDefault(c, 0) + 1);
            if(need.containsKey(c) && need.get(c).intValue()== window.get(c).intValue() )
            {
                formed++;
            }
            while(required==formed)
            {
                if(minlen>right-left+1)
                {
                start =left;
                minlen=right-left+1;
                }
                window.put(s.charAt(left),window.get(s.charAt(left))-1);
                
                if(need.containsKey(s.charAt(left)) && window.get(s.charAt(left))<need.get(s.charAt(left)))
                {
                    formed--;
                }
                left++;
            }


        }
     
        return (minlen == Integer.MAX_VALUE)?"":s.substring(start,start+minlen);
    }
}