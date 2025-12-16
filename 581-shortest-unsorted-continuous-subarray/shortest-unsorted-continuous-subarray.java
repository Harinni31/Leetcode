class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n= nums.length;
        int[] a=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=nums[i];
        }
        Arrays.sort(a);
        int left=0;
        int right=n-1;
        while(left<n&&nums[left]==a[left])
        {
            left++;
        }
        while(right>=0 &&nums[right]==a[right])
        {
            right--;
        }
        if(left==n&& right==-1)
        {
            return 0;
        }
       return right+1-left; 
    }
}