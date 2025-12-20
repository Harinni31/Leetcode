class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
     
        if(sum>=threshold * k)
        {
            count++;
        }
        //maxcount=arrcount; avoids division more precision
        for(int i=k;i<arr.length;i++)
        {
            sum+=arr[i];
            sum-=arr[i-k];
            //sum/k=threshold;
           if(sum>=threshold * k)
        {
            count++;
            
        }
        }
        return count;
    }
}