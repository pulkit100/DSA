class Solution {

    public void dfs(char[][] grid, int i, int j) {

        // Boundary check + water check
        if (i < 0 || i >= grid.length ||
            j < 0 || j >= grid[0].length ||
            grid[i][j] == '0') {

            return;
        }

        // Mark current land as visited
        grid[i][j] = '0';

        // Up
        dfs(grid, i - 1, j);

        // Down
        dfs(grid, i + 1, j);

        // Left
        dfs(grid, i, j - 1);

        // Right
        dfs(grid, i, j + 1);
    }

    public int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == '1') {

                    // Complete island ko visit karo
                    dfs(grid, i, j);

                    // Ek complete island mil gaya
                    count++;
                }
            }
        }

        return count;
    }
}