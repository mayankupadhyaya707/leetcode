class Solution {
    public int numIslands(char[][] grid) 
    {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][]visited=new boolean[m][n];
        int numOfIslands=0;
        if(grid==null||m==0||n==0)
            return 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(!visited[i][j]&&grid[i][j] == '1')
                {
                    dfs(grid,i,j,visited);
                    numOfIslands++;
                }
            }
        }
        return numOfIslands;
    }
    public void dfs(char[][]grid,int row,int col,boolean[][]visited)
    {
        if(row<0||col<0||row>=grid.length||col>=grid[row].length||visited[row][col]||grid[row][col]=='0')
        {
            return ;
        }
        visited[row][col]=true;
        dfs(grid,row,col-1,visited);
         dfs(grid,row-1,col,visited);
         dfs(grid,row,col+1,visited);
         dfs(grid,row+1,col,visited);
    }
}