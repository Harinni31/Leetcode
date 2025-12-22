class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>[] bucket=new ArrayList[nums.length+1];//List<Integer>[]: This declares a variable named bucket as an array type. The elements inside this array will be of type List<Integer>.
        int[] result=new int[k];
  
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
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
        int indx=0;
        for(int i=nums.length;i>=0 && indx<k;i--)
        {
            if (bucket[i]!=null)
            {
                for(int num:bucket[i])
                {
                     result[indx++]=num;
                     if(indx==k) break;
                }
               
            }
        }
       
        return result;
    }
}