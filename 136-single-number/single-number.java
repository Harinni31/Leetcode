class Solution {
    public int singleNumber(int[] nums) {
      /*  HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet())
        {
            if(map.get(key)== 1) return key;    gives o(n) space-since hash stores space of n elements
        }
        return 0;
        */ 
        int ans=0;
        for(int num:nums)
        {
            ans^=num;//xor
        }
        return ans;
    }
}