class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       // List<List<String>> list=new Arraylist<>();
        //List<String> s=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
          char[] a=  s.toCharArray();
          Arrays.sort(a);
        String key=new String(a);
          if(!map.containsKey(key))
          {
            map.put(key,new ArrayList<>());
          }
          map.get(key).add(s);

        }
        return new ArrayList<>(map.values());

    }
}