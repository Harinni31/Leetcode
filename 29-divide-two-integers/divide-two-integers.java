class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        long ans=0;//quotionent
        boolean negative =(dividend<0)^(divisor<0);
        long dvd=Math.abs((long) dividend);
        long dvs=Math.abs((long) divisor);
       
        
        while(dvd>=dvs)
        {
            int shift=0;
            while((dvs << (shift+1))<=dvd)
            {
                shift++;
            }
            dvd-=dvs << shift;
            ans+=1L<<shift;

        }
        if(negative)
        {
            ans=-ans;
        }
        return (int)ans;
    }
}