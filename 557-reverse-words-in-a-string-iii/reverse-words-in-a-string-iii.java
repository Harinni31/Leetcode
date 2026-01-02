class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
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
    }
}