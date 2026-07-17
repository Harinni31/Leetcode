class Solution {
    public void sortColors(int[] nums) {
         HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
          map.put(num,map.getOrDefault(num,0)+1);
        }
        int i=0;
        for(int x=0;x<=2;x++)
        {
            int size= map.getOrDefault(x,0);
            int j=0;
            while(j<size)
            {
                nums[i++]=x;
                j++;
            }
        }
    }
}