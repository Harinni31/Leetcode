class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int left=0;
        int maxlen=0;
        int count=0;
        int n=answerKey.length();
        for(int right=0;right<n;right++)
        {
            if(answerKey.charAt(right)=='F')
            {
                count++;
            }
            while(count>k)
            {
                if(answerKey.charAt(left)=='F')
                {
                    count--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        count=0;
        left=0;
        for(int right=0;right<n;right++)
        {
            if(answerKey.charAt(right)=='T')
            {
                count++;
            }
            while(count>k)
            {
                if(answerKey.charAt(left)=='T')
                {
                    count--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}