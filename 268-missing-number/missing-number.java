class Solution {
    public int missingNumber(int[] nums) {
       Arrays.sort(nums);
       int index=0;
       
       for(int num:nums) 
       {
        if(index!=num) break;
       
        index++;
       }
       return index;
    }
}