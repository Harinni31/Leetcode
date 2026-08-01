class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxkadane=nums[0];
        int currentmax=nums[0];
        int currentmin=nums[0];
        int total=nums[0]; 
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currentmax=Math.max(currentmax+nums[i],nums[i]);
            maxkadane=Math.max(maxkadane,currentmax);
             
            currentmin=Math.min(currentmin+nums[i],nums[i]);
            min=Math.min(min,currentmin);

            total+=nums[i];
        }
        
        return (maxkadane<0)?maxkadane:Math.max(maxkadane,total-min);
    }
}