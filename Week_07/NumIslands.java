/**
* 广度优先搜索
*/
class Solution {
        public int numIslands(char[][] grid) {
            int landsNums = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        landsNums++;
                        Queue<String> queue = new LinkedList<>();
                        queue.offer(i + "," + j);
                        grid[i][j] = '0';
                        while (!queue.isEmpty()) {
                            String peek = queue.poll();
                            int row = Integer.parseInt(peek.split(",")[0]);
                            int col = Integer.parseInt(peek.split(",")[1]);
                            if (row > 0 && grid[row - 1][col] == '1') {
                                queue.offer((row - 1) + "," + col);
                                grid[row - 1][col] = '0';
                            }
                            if (col > 0 && grid[row][col - 1] == '1') {
                                queue.offer(row + "," + (col - 1));
                                grid[row][col - 1] = '0';
                            }
                            if (row < grid.length - 1 && grid[row + 1][col] == '1') {
                                queue.offer((row + 1) + "," + (col));
                                grid[row + 1][col] = '0';
                            }
                            if (col < grid[0].length - 1 && grid[row][col + 1] == '1') {
                                queue.offer(row + "," + (col + 1));
                                grid[row][col + 1] = '0';
                            }
                        }
                    }
                }
            }
            return landsNums;
        }
    }
	
	
/**
* 深度优先
*/
	class Solution {
    void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }

        return num_islands;
    }
}