class Solution {
    public String reverseWords(String s) {
        int start=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<=arr.length;i++)
        {
            if( i==arr.length || arr[i]==' ')
            {
                reverse(arr,start,i-1);
                start=i+1;
            }

        }
       return new String(arr);
    }
    private void reverse(char[] arr,int left,int right)
    {
        while(left<right)
        {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            right--;
            left++;
        }
    }
}
/* StringBuilder sb=new StringBuilder();
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
            sb.append(s.charAt(i));
            }
            if(s.charAt(i)== ' ' || i==s.length()-1)
            {
                
                sb.reverse();    
                st.append(sb.toString());
                //sb.delete(0,sb.length());
                sb.setLength(0);
                if(s.charAt(i)==' ')
                {
                    st.append(" ");
                }
            }
        }
        return st.toString();
        */