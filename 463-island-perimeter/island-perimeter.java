class Solution {

    int peri = 0;

    public void dfs(int[][] grid, int i, int j) {

        int m = grid.length;
        int n = grid[0].length;
        // boundary condition check (checking wall )
        if (i<0 || j<0 || i>=m || j>=n || grid[i][j] == 0 ) {
            peri++;
            return;
        }

        if ( grid [i][j] == -1 ) {
            return;
        }

        grid[i][j] = -1; // marked visited

        // dfs

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
    public int islandPerimeter(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {

                if ( grid[i][j] == 1 ) {
                    dfs(grid, i, j);
                    return peri;
                }
            }
        }

        return peri;
    }
}