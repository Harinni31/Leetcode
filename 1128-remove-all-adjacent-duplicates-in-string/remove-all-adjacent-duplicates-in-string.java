class Solution {
    public String removeDuplicates(String s) {
         Stack<Character> st=new Stack<>();
         for(int i=0;i<s.length();i++)
         {
            char c=s.charAt(i);
            if(st.isEmpty()||st.peek()!=c)
            {
                st.push(c);
            }
            else
            {
                st.pop();
            }
         }
         StringBuilder sb=new StringBuilder();
         for(char c:st)
         {
            sb.append(c);
         }
         return sb.toString();
    }
}/*
StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(sb.length()>0 && sb.charAt(sb.length()-1)==ch)
            {
                sb.deleteCharAt(sb.length()-1);
            }
            else
            {
                sb.append(ch);
            }
        }
        return sb.toString();
        */