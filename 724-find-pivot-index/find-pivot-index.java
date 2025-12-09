class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        if(nums.length==1) return 0;
        for(int i=1;i<nums.length;i++)
        {
            sum+=nums[i-1];
            int s=0;
            for(int j=i+1;j<nums.length;j++)
            {
                s+=nums[j];
            }
            if(i-1==0&&s+nums[i]==0)
            {
                return 0;
            }
            if(s==sum)
            {
                return i;
            }
        }
        return -1;
    }
}