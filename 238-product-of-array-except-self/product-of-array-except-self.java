class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        answer[0]=1;
        int n=nums.length-1;
        for(int i=1;i<=n;i++)
        {
        answer[i]=answer[i-1]*nums[i-1];
        }
        int right=1;
        for(int i=n;i>=0;i--)
        {
            answer[i]=right*answer[i];
            right=right*nums[i];
        }
        return answer;
    }
}