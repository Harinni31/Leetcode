class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr=new int[nums.length];
        int index=0;
        for(int num:nums)
        {
            arr[index++]=num*num;
        }
        Arrays.sort(arr);
        return arr;
    }
}