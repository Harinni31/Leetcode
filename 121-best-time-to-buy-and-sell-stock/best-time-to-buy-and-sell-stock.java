class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int profit=0;
        for(int num:prices)
        {
            if(minprice>num)
            {
                minprice=num;
            }
            else
            {
                profit=Math.max(profit,num-minprice);
            }
        }
         return profit;
    }
}