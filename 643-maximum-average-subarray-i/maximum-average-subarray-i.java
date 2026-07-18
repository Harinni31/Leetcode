class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0;
        double sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        avg=sum/k;
        int left=0;
        for(int i=k;i<nums.length;i++)
        {
            sum-=nums[i-k];
            sum+=nums[i];
            avg=Math.max(avg,sum/k);
            
        }
        return avg;
    }
}