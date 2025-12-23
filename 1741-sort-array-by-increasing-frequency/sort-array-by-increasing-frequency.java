class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        int[] result=new int[nums.length];
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        } 
        for(int key:map.keySet())
        {
            int freq=map.get(key);
            if(bucket[freq]==null)
            {
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int index=0;
        for(int i=0;i<nums.length+1;i++)
        {
            if(bucket[i]!=null)
            {
                Collections.sort(bucket[i],Collections.reverseOrder());
                for(int num:bucket[i])
                {
                    for(int j=0;j<i;j++)
                
                    result[index++]=num;
                }
            }
        }
        return result;
    }
}