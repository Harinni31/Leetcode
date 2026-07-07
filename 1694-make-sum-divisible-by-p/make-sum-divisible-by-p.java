class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum=0;
        for(int num:nums)
        {
            sum=(sum+num);
        }
        int k=(int)(sum%p);
        if(k==0) return 0;
        if(k<0)
        {
            k+=p;
        }
         
        int cursum=0;
        int minlen=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);

        for(int i=0;i<nums.length;i++ )
        {
           cursum=(cursum+nums[i])%p;
         //  rem=(rem+nums[i])%p;
        if(cursum<0)
        {
            cursum+=p;
        }
        int rem=cursum;
        int need=(rem - k + p) % p;

            if(map.containsKey(need))
            {
                minlen=Math.min(minlen,i-map.get(need));
            }
            map.put(rem,i);
        }
    return  minlen==nums.length?-1:minlen;
    }
}