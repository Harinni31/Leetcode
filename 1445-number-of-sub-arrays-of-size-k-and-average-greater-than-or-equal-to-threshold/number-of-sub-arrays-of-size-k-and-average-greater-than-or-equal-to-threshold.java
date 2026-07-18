class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
            int count=0;
            double sum=0;
            for(int i=0;i<k;i++)
            {
                sum+=arr[i];
            }
            double avg=sum/k;
            if(avg>=threshold) count++;
            for(int i=k;i<arr.length;i++)
            {
              //  if(avg>=threshold) count--;
                sum+=arr[i]-arr[i-k];
                avg=sum/k;
                if(avg>=threshold) count++;
                
            }

            return count;
    }
}



