class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int currentsum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int temp=currentsum+nums[i];
            if(temp>nums[i])
            {
                currentsum=temp;
            }
            else
            {
                currentsum=nums[i];
            }
            if(maxsum<currentsum)
            {
                maxsum=currentsum;
            }
        }
        return maxsum;
    }
}