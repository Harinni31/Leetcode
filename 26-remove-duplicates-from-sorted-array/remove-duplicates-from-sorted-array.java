class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet();
        int k=0;
        for(int num:nums)
        {
            if(!set.contains(num))
            {
                nums[k++]=num;
                set.add(num);
            }
        }
        return k;
    }
}