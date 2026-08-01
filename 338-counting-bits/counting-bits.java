class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
      
       
        for(int i=0;i<=n;i++)
        {
            int org=i;
             int count=0;
            while(org!=0)
            {
                if((org&1)==1)
                {
                    count++;
                }
                org>>>=1;
            }
            ans[i]=count;
            
        }
        return ans;
    }
}