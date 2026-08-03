class Solution {
    public List<String> generateParenthesis(int n) {
        int opencount=0;
        int closecount=0;
        String currentString="";
        List<String> result=new ArrayList<>();
        backtrack(opencount,closecount,n,currentString,result);
        return result;
    }
    private static void backtrack(int open,int close,int n,String currentString,List<String>result)
    {
        if(open==n && close==n)
        {
            result.add(currentString);
            return;
        }
        if(open<n)
        {
            backtrack(open+1,close,n,currentString+"(",result);
        }
        if(close<open)
        {
            backtrack(open,close+1,n,currentString+")",result);
        }
    }
}