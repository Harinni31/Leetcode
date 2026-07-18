class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int total=0;
        int n=cardPoints.length;
        for(int i=0;i<n;i++)
        {
            total+=cardPoints[i];
        }
        for(int i=0;i<n-k;i++)
        {
            sum+=cardPoints[i];
        }
       // int complement=total-sum;
        int maxc=total-sum;
       // int s=n-k;
        for(int i=n-k;i<n;i++)
        {
            sum+=cardPoints[i]-cardPoints[i-n+k];
            maxc=Math.max(maxc,total-sum);

        }
       // cmax=Math.max(cmax,sum);
        return maxc;
    }
}