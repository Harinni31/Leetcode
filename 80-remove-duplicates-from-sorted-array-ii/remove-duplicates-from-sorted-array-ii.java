class Solution {
    public int removeDuplicates(int[] nums) {
        int index=1;
        for(int i=1;i<nums.length;i++)
        {
          if(index<2 || nums[index-2]!=nums[i])
          {
            nums[index++]=nums[i];
          }  
        }
        return index;
    }
}