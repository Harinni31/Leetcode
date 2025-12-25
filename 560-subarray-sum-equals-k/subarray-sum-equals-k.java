class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer>map=new HashMap<>();
       int currentsum=0;
       int count=0;
       for(int num:nums)
       {
        currentsum+=num;
        if(currentsum-k==0)
        {
            count++;
        }
        if(map.containsKey(currentsum-k))
        {
            count+=map.get(currentsum-k);
        }
        map.put(currentsum,map.getOrDefault(currentsum,0)+1);
        
       }
        return count;
    }
}