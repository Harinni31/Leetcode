class Solution {
    public int[][] merge(int[][] intervals) {

        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i=0;i<intervals.length;i++)
        {
            int newstart=intervals[i][0];
            int currentend=intervals[i][1];
            List<Integer>ilist=new ArrayList<>();
                while(i<intervals.length-1&&currentend>=intervals[i+1][0])
            {
                 currentend=Math.max(currentend,intervals[i+1][1]);
                 i++;
            }
            int newend=currentend;
            result.add(Arrays.asList(newstart,newend));
           
        }
        int[][] arr=new int[result.size()][2];
        for(int i=0;i<result.size();i++)
        {
            arr[i][0]=result.get(i).get(0);
            arr[i][1]=result.get(i).get(1);
        }
        return arr;
    }
}