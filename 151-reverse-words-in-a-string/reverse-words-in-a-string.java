class Solution {
    public String reverseWords(String s) {
     /*   s=s.trim();
        String[] str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=str.length-1;i>=0;i--)
        {
            if(!str[i].isEmpty())
            {
            sb.append(str[i]);
            sb.append(" ");
            }
        }
        
        return sb.toString().trim();
        */
        int i=s.length()-1;
        StringBuilder sb=new StringBuilder();
        while(i>=0)
        {
            while(i>=0 && s.charAt(i)==' ') i--;//last index before space from end j+1-->i
            int j=i;
            while(j>=0 && s.charAt(j)!=' ') j--;// start index
            sb.append(s.substring(j+1,i+1));
            sb.append(" ");
            i=j-1;
        }
        return sb.toString().trim();
    }
}