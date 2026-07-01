class Solution {
    public void moveZeroes(int[] nums)
    {
        int index=0;
        for(int num:nums)
        {
            if(num!=0)
            {
                nums[index++]=num;
            }
        }
        for(int i=index;i<nums.length;i++)
        {
            nums[index++]=0;
        }
        /*
        int insertpos=0;
        for(int num:nums)
        {
            if(num!=0)
            {
                nums[insertpos++]=num;
            }
        }
        while(insertpos<nums.length)
        {
            nums[insertpos++]=0;
        }
        */
    }
}