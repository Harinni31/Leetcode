class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int index=0;
        int[] arr=new int[n*m];
       for(int d=0;d<m+n-1;d++)
       {
        List<Integer> list=new ArrayList<>();//list is diagonal
        int row=(d<m)?0:d-m+1;
        int col=(d<m)?d:m-1;
        while(row<n && col>=0)
        {
            
             list.add(mat[row++][col--]);
             
        }
        if(d%2==0)
        {
            Collections.reverse(list);
        }
        for(int num:list)
        {
            arr[index++]=num;
        }

       } 
       
        return arr;
    }
}