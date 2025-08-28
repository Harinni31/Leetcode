class Solution {
    public int findDuplicate(int[] nums) {
        int duplicate=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            if(!set.contains(num))
            {
                set.add(num);
            }
            else{
                duplicate=num;
            }
            
        }
        return duplicate;
    }
}