class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int d=0;
        int r=0;
        String str="";
        StringBuilder sb=new StringBuilder();
         StringBuilder[] rows=new StringBuilder[numRows];
         for(int i=0;i<numRows;i++)
        {
            rows[i]=new StringBuilder();        }
        for(int i=0;i<s.length();i++)
        {
            rows[r].append(s.charAt(i));
            if(r==0) {d=1;}
            if(r==numRows-1) { d=-1;}
            r+=d;
        }
        for(int i=0;i<numRows;i++)
        {
            sb.append(rows[i]);
        }
        return sb.toString();
    }
}