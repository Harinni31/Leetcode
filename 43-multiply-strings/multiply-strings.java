class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")) return "0";
        int n=num1.length();
        int m=num2.length();
         
        int[] result =new int[n+m];
        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                int digit1=num1.charAt(j)-'0';
                int digit2=num2.charAt(i)-'0';
                int mul=digit2*digit1;
                int p2=i+j+1;
                int p1=i+j;
                int sum=mul+result[p2];//adding existing value
                result[p2]=sum%10;//ones;
                result[p1]+=sum/10;//carry
            }
        }
        StringBuilder sb= new StringBuilder();
        int i=0;
        while(i<result.length && result[i]==0)
        {
            i++;
        }
        while (i < result.length) 
        {
             sb.append(result[i]);
                 i++;
        }
        return sb.toString();
    }
}