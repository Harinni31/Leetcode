class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right)
        {
            int high=Math.min(height[left],height[right]);
            int width=right-left;
            max=Math.max(max,high*width);
            if(height[left]>height[right])
            {
                right--;
            }
            else{
                left++;
            }
        }
         return max;
        
    }
}