class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=0;
        int prod=0;
        for(int i=0;i<nums.length-1;i++)
        
        {
            int left=i;
            int right=i+1;
            while(right<nums.length && left<right)
            {
                prod=(nums[left]-1)*(nums[right]-1);
                maxprod=Math.max(maxprod,prod);
                right++;
                
            }
        }
        return maxprod;
    }
}