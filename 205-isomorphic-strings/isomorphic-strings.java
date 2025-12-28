class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] c1=s.toCharArray();
        char[] c2 = t.toCharArray();
        if(c1.length!=c2.length) return false;
        HashMap<Character,Character>map=new HashMap<>();
        HashMap<Character,Character>m=new HashMap<>();
        for(int i=0;i<c1.length;i++)
        {
            if(map.containsKey(c1[i]))
            {
                if(!map.get(c1[i]).equals(c2[i]))
                {
                    return false;
                }
            }  
            if(m.containsKey(c2[i]))
            {
                if(!m.get(c2[i]).equals(c1[i]))
                {
                    return false;
                }
            }
            map.put(c1[i],c2[i]); 
            m.put(c2[i],c1[i]);
        }
        return true;
    }
}