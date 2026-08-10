class Solution {
    public int majorityElement(int[] nums) {
   int vote=1;
   int maj=nums[0];
   for(int i=1;i<nums.length;i++)
   {
        if(nums[i]==maj)
        {
            vote++;
        }
        else
        {
            vote--;
        }
        if(vote==0)
        {
            maj=nums[i];
            vote=1;
        }

   }
   int count=0;
   for(int i=0;i<nums.length;i++)
   {
    if(nums[i]==maj)
    {
        count++;
    }
   }
   return count>nums.length/2?maj:-1;
    }
}
/*
     HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            if(m.getValue()>nums.length/2)
            {
                return m.getKey();
            }
        }
        return -1;
        */