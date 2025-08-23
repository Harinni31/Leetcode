class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       int n = triangle.size();
        
        // start from the last row
        List<Integer> dp = new ArrayList<>(triangle.get(n - 1));
        
        // go upwards from second-last row
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                // update dp[j] to hold min path sum from this cell downward
                int temp = Math.min(dp.get(j), dp.get(j + 1));
                dp.set(j, triangle.get(i).get(j) + temp);
            }
        }
        
        return dp.get(0);
    }
}