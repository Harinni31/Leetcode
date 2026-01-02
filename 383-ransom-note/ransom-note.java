class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        for(char c:magazine.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:ransomNote.toCharArray())
        {
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map1.entrySet())
        {
            if(!map.containsKey(e.getKey()) || e.getValue()>map.get(e.getKey()))
            {
                return false;
            }
        }
        return true;
    }
}