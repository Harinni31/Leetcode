class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(String s:words)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<String> result=new ArrayList<>();
        List<String>[] bucket=new ArrayList[words.length+1];
        for(String s:map.keySet())
        {
            int freq=map.get(s);
            if(bucket[freq]==null)
            {
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(s);
        }
        int index=0;
        for(int i =words.length-1;i>0&& result.size()<k;i--)
        {
            if(bucket[i]!=null)
            {
                Collections.sort(bucket[i]);
                for(String s:bucket[i])
                {
                    result.add(s);
                    if(result.size()==k) break;
                }
            }
        }
        return result;
    }
}