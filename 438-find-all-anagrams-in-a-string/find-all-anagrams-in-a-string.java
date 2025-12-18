class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq1=new int[26];
         int[] freq2=new int[26];
        for(char c:p.toCharArray())
        {
            freq1[c-'a']++;
        }
        int window=p.length();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            freq2[s.charAt(i)-'a']++;
            if(i>=window)
            {
                freq2[s.charAt(i-window)-'a']--;
            }
            if(match(freq1,freq2))
            {
                list.add(i-window+1);
            }
             
        }
        return list;
    }
    public boolean match(int[] a,int[] b)
    {
        for(int i=0;i<26;i++)
        {

            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}
