class Solution {
    public int pivotIndex(int[] nums) {
            int sum=0;
            int total=0;
            for(int num:nums)
            {
                total+=num;
            }
            for(int i=0;i<=nums.length-1;i++)
            {
                if(total-nums[i]-sum==sum)
                {
                    return i;
                }
                sum+=nums[i];
                

            }
            return -1;
    }
}