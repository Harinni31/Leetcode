class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxarea=0;
        
            int left=0;
            int right=n-1;
            while(left<right)
            {
                int min=Math.min(height[left],height[right]);
                 maxarea=Math.max(maxarea,(right-left)*min);
                 if(height[left]<height[right])
                 {
                    left++;
                 }
                 else
                 {
                    right--;
                 }
            
            }
       
        return maxarea;
    }
}