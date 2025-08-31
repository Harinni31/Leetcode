class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
         if(matrix==null||matrix.length==0) return list;
        int rowBeg=0;
        int rowEnd=matrix.length-1;
        int colBeg=0;
        int colEnd=matrix[0].length-1;
        while(rowBeg<=rowEnd && colBeg<=colEnd)
        {
            for(int i=colBeg;i<=colEnd;i++)
            {
                list.add(matrix[rowBeg][i]);
            }
            rowBeg++;
            for(int i=rowBeg;i<=rowEnd;i++)
            {
                list.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowBeg<=rowEnd)
            {
                for(int i=colEnd;i>=colBeg;i--)
                {
                    list.add(matrix[rowEnd][i]);
                }
                
            }rowEnd--;

            if(colBeg<=colEnd)
            {
                for(int i=rowEnd;i>=rowBeg;i--)
                {
                    list.add(matrix[i][colBeg]);
                }
                
            }
            colBeg++;
        }
        return list;
    }
}