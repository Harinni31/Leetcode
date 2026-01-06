class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        int index=nums.length-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
           int leftsq=nums[l]*nums[l];
            int rightsq=nums[r]*nums[r];
            if(leftsq<rightsq)
            {
                arr[index]=rightsq;
                r--;
            }
            else
            {
                arr[index]=leftsq;
                l++;
            }
            index--;
        }
        /*int[] arr=new int[nums.length];
        int index=0;
        for(int num:nums)
        {
            arr[index++]=num*num;
        }
        Arrays.sort(arr);
        return arr;*/
        return arr;
    }
}