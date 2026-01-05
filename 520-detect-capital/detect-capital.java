class Solution {
    public boolean detectCapitalUse(String word) {
           int count=0;
        
        if(isUpperCase(word)) return true;
        if(isLowerCase(word)) return true;

        if(Character.isUpperCase(word.charAt(0)))
        {
        for(int i=1;i<word.length();i++)
        {
         
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)) return false;
           
        }
        return true;
        
        }
        return false;
    }
    private boolean isUpperCase(String w)
    {
        //boolean flag
        for(char c:w.toCharArray())
        {
            if(!Character.isUpperCase(c))
            {
                return false;
            }
        }
        return true;
    }
    private boolean isLowerCase(String w)
    {
        //boolean flag
        for(char c:w.toCharArray())
        {
            if(!Character.isLowerCase(c))
            {
                return false;
            }
           
        }
         return true;
    }
}