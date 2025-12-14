class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[] a=new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            int complement=target-numbers[i];
            if(map.containsKey(complement))
            {
                a[0]=map.get(complement)+1;
                a[1]=i+1;
            }
            map.put(numbers[i],i);
            
        }
        return a;
    }
}