class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxlen=0;
        int left=0;
    //i denotes right.
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.containsKey(c)&&map.get(c)>=left)
            {
                left=map.get(c)+1;
            }
           map.put(c,i);
                maxlen=Math.max(maxlen,i-left+1);
          
        }
        return maxlen;
    }
}
/*
import java.util.*;
public class LongestSubstringLength {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String s = sc.nextLine();
      //return input;
        int left=0;
        int maxlength=0;
        int n=s.length();
        int[] freq= new int[26];
      
        for(int right=0;right<n;right++)
        {
            char c=s.charAt(right);
            freq[c-'a']++;
            while(freq[c-'a']>1)
            {
                freq[s.charAt(left++)-'a']--;

            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        System.out.println(maxlength);
    }
}

*/