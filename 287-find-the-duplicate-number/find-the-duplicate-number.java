class Solution {
    public int findDuplicate(int[] nums) {
       int slow=0;
        int fast=0;
       do
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        } while(slow!=fast);
        slow=0;
         while(slow!=fast)
         {
             slow=nums[slow];
            fast=nums[fast];
         }
     /*   int duplicate=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            if(set.contains(num))
            {
                //return num;
                duplicate=num;
                break;
            }
            set.add(num);
            
            
        }
        return duplicate;*/
       // return -1;
       return slow;
    }
}