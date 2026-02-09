class NumArray {
    static int[] prefix;
    public NumArray(int[] nums) {
        prefix=new int[nums.length+1];
        prefix[0]=0;
        int index=1;
        for(int num:nums)
        {
            prefix[index]=prefix[index-1]+num;
            index++;
        }
    }
    
    public int sumRange(int left, int right) {
        return prefix[right+1]-prefix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */