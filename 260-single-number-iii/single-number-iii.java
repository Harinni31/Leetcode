class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] arr=new int[2];
        int index=0;
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int m:map.keySet())
        {
            if(map.get(m)==1)
            {
                arr[index++]=m;
            }
        }
        return arr;
    }
}