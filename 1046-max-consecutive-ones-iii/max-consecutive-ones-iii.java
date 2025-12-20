class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int maxfreq=0;
        int maxlen=0;
        int count=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==1) count++;
            maxfreq=Math.max(maxfreq,count);
            int windowlen=right-left+1;
            if(windowlen-maxfreq>k)
           {
            if(nums[left]==1) count--;
            left++;
           }
           maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}