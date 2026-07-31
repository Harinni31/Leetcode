class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int child=0;
        int cookies=0;
        Arrays.sort(g);
        Arrays.sort(s);

        int count=0;
        while(child<g.length && cookies<s.length)
        {
            if(g[child]<=s[cookies])
            {
                count++;
                child++;
                cookies++;
            }
            else
            {
                cookies++;
            }
        }
        return count;
    }
}