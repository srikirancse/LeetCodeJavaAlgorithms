package Medium;

/**
 * Created by Srikiran Sistla on 4/20/2017.
 * Minimum Path Sum
 */
public class Q64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length; //row length
        int n = grid[0].length; // column length
        for (int i = 0; i<m; i++){
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) grid[i][j] = grid[i][j]; // first element
                else if (i == 0) grid[i][j] += grid[i][j-1]; //first row
                else if (j == 0) grid[i][j] += grid[i-1][j]; // first column
                else grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        return grid[m-1][n-1];
    }
}
