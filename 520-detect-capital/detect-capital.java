class Solution {
    public boolean detectCapitalUse(String word) {
           int count=0;
        if(Character.isUpperCase(word.charAt(0)))
        {
        for(int i=1;i<word.length();i++)
        {
         
            char ch=word.charAt(i);
            if(Character.isLowerCase(ch)) count++;
           
        }
         if(count==word.length()-1) return true;
        }
        if(isUpperCase(word)) return true;
        if(isLowerCase(word)) return true;

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