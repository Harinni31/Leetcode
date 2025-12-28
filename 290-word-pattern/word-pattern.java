class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        char[] c = pattern.toCharArray();
        if(c.length!=str.length) return false;
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> m=new HashMap<>();
        for(int i=0;i<c.length;i++)
        {
            if(map.containsKey(c[i]))
             { if(!map.get(c[i]).equals(str[i])) 
             { return false; } 
            } 
             if(m.containsKey(str[i])) 
             { if(!m.get(str[i]).equals(c[i])) 
             { return false; }
              } 
               
            map.put(c[i],str[i]);
            m.put(str[i],c[i]);
            
          
        }
        return true;
    }
}