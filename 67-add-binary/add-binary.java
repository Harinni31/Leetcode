class Solution {
    public String addBinary(String a, String b) {
        int sum=0;
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder sb=new StringBuilder();
        while(i>=0 || j>=0 || carry==1)
        {
            int x= i>=0?a.charAt(i)-'0':0;
            int y=j>=0?b.charAt(j)-'0':0;
            sum=x+y+carry;
            sb.append(sum%2);
            carry=sum/2;
            i--;
            j--;
         
        }
        return sb.reverse().toString();
    }
}