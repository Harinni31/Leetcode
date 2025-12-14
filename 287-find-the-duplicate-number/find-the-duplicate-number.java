class Solution {
    public int findDuplicate(int[] nums) {
        int duplicate=-1;
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
        return duplicate;
       // return -1;
    }
}