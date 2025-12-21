class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    private int atmost(int[] nums,int k)
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
    }
}