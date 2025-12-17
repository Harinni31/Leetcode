class Solution {
    public int compress(char[] chars) {
        int i=0;
        int index=0;
        while(i<chars.length)
        {
            char t=chars[i];
            int count=0;
            while(i<chars.length && t==chars[i])
            {
                count++;
                i++;
            }
            chars[index++]=t;
            if(count>1)
            {
                for(char c:String.valueOf(count).toCharArray())
                {
                    chars[index++]=c;
                }
            }
        }
       return index;
    }
}