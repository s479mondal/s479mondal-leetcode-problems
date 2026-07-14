class Solution {
    public void dfs(int newImage[][],int r,int c,int oldColor,int newColor)
    {
        if(r<0 || r>=newImage.length || c<0 || c>=newImage[0].length)
        {
            return;
        }
        if(newImage[r][c]==newColor)
        {
            return;
        }
        if(newImage[r][c]!=oldColor)
        {
            return;
        }
        newImage[r][c]=newColor;
        dfs(newImage,r+1,c,oldColor,newColor);
        dfs(newImage,r-1,c,oldColor,newColor);
        dfs(newImage,r,c+1,oldColor,newColor);
        dfs(newImage,r,c-1,oldColor,newColor);
    } 
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] newImage=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                newImage[i][j]=image[i][j];
            }
        }
        if(newImage[sr][sc]==color)
        {
            return newImage;
        }
        int oldColor=newImage[sr][sc];
        dfs(newImage,sr,sc,oldColor,color);
        return newImage;
    }
}