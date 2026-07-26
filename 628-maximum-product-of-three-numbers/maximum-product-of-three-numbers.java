class Solution {
    public int maximumProduct(int[] nums) {
       // int product=1;
        Arrays.sort(nums);
        int n=nums.length-1;
        int option1=nums[n]*nums[n-1]*nums[n-2];
        int option2=nums[0]*nums[1]*nums[n];
        int product=Math.max(option1,option2);
        return product;
    }
}
