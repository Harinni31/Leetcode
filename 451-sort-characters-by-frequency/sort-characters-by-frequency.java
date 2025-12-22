class Solution {
    public String frequencySort(String s) {
         HashMap<Character,Integer>map=new HashMap<>();
        List<Character>[] bucket=new ArrayList[s.length()+1];
        //List<Integer>[]: This declares a variable named bucket as an array type. The elements inside this array will be of type List<Integer>.
        
  
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char key:map.keySet())
        {
            int freq=map.get(key);
            if(bucket[freq]==null)
            {
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }
     
        StringBuilder sb=new StringBuilder();
        for(int i=s.length();i>=0 ;i--)
        {
            if (bucket[i]!=null)
            {
                for(char c:bucket[i])
                {
                     for (int j = 0; j < i; j++) {
                     sb.append(c);
                     }
                     
                }
               
            }
        }
       
        return sb.toString();

        
    }
}