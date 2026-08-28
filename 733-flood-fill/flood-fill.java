class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgcolor=image[sr][sc];
        if(orgcolor==color)
        {
            return image;
        }
        dfs(image,sr,sc,orgcolor,color);
        return image;
    }
    private static void dfs(int[][]image,int r,int c,int orgcolor,int newcolor)
    {
        int row=image.length;
        int col=image[0].length;
        if(r<0||r>=row ||c<0||c>=col)
        {
            return ;
        }
        if(image[r][c]!=orgcolor)
        {
            return;
        }
        image[r][c]=newcolor;
        dfs(image,r-1,c,orgcolor,newcolor);//up
         dfs(image,r+1,c,orgcolor,newcolor);//down
          dfs(image,r,c-1,orgcolor,newcolor);//left
           dfs(image,r,c+1,orgcolor,newcolor);//right
              }
}