class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[2];
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
         int complement=target-nums[i];
         if(map.containsKey(complement))
         {
            arr[index++]=i;
            arr[index]=map.get(complement);
         }   
         else
         {
            map.put(nums[i],i);
         }
        }
        return arr;
    }
}