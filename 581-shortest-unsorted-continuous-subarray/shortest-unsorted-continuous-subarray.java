class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n= nums.length;
        int startpointer=Integer.MIN_VALUE;
        int endpointer=Integer.MAX_VALUE;
        int left=-1;int right=-1;

        for(int i=0;i<n;i++)
        {
            if(nums[i]<startpointer)
            {
                 right=i;
            }
            else
            {
                startpointer=nums[i];
            }
        }
        if(right==-1) return 0;
        for(int i=n-1;i>=0;i--)
        {
            if(nums[i]>endpointer)
            {
                 left=i;
            }
            else
            {
                endpointer=nums[i];
            }
        }
       return right-left+1; 
    }
}