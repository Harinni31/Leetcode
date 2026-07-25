class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int extra=0;
        for(int i=0;i<minutes;i++)
        {
            if(grumpy[i]==1) extra+=customers[i];
        }
        int gain=extra;
        for(int i=minutes;i<grumpy.length;i++)
        {
            if(grumpy[i]==1)
            {
                extra+=customers[i];
            }
            if(grumpy[i-minutes]==1)
            {
                extra-=customers[i-minutes];
            }
            gain=Math.max(gain,extra);
        }
        for(int i=0;i<customers.length;i++)
        {
            if(grumpy[i]==0)
            {
                gain+=customers[i];
            }
        }
        return gain;
    }
}