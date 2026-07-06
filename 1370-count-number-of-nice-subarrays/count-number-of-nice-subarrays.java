class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
      //  return atmost(nums,k)-atmost(nums,k-1);
      HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
      int count=0;
      map.put(0,1);
      for(int num:nums)
      {
        if(num%2!=0)
        {
            sum+=1;
        }
        if(sum >= k)
        {
            if(map.containsKey(sum-k))
            {
                count+=map.get(sum-k);
            }
            
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
      }
      return count;
    }
  /*  private int atmost(int[] nums,int k)
    {  
        
        int left=0;
        int count=0;
        int nice=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]%2!=0) count++;
            while(count>k)
            {
                if(nums[left]%2!=0) count--;
                left++;
            }
            nice+=(right-left+1);
        }
        return nice;
    }*/
}