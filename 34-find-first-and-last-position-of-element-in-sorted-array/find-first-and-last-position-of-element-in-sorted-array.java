class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurance(nums,target,0,nums.length-1);
        int last=lastOccurance(nums,target,0,nums.length-1);
        
        

         return new int[] {first,last};
    }
    private static int firstOccurance(int [] nums,int target, int left,int right)
    {
        int ans=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
         }
         return ans;
    }
    private static int lastOccurance(int [] nums,int target, int left,int right)
    {
        int ans=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
         }
         return ans;
    }
}