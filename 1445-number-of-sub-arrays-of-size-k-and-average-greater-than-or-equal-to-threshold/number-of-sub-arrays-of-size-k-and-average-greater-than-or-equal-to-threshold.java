class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int arrcount=0;
        int maxcount=0;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int avg=sum/k;
        if(avg>=threshold)
        {
            arrcount++;
        }
        //maxcount=arrcount;
        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i];
            sum-=arr[i-k];
            avg=sum/k;
           if(avg>=threshold)
        {
            arrcount++;
            //maxcount=Math.max(maxcount,arrcount);
        }
        }
        return arrcount;
    }
}