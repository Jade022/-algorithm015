/**
*O(M,N)M,N分别为行数和列数
*/
class Solution {
        public int numIslands(char[][] grid) {
            int landNum = 0;// 岛屿个数
            for (int i = 0; i < grid.length; i++) {// 数组行数
                for (int j = 0; j < grid[0].length; j++) {// 数组列数
                    if (grid[i][j] == '1') {
                        landNum++;
                        Queue<String> queue = new LinkedList<String>();
                        queue.offer(i + "," + j); //将此数字放入队列中
                        grid[i][j] = '0';
                        while (!queue.isEmpty()) {
                            String peek = queue.peek();//获取队列第一个
                            queue.poll();//出队列
                            int row = Integer.parseInt(peek.split(",")[0]);// 算出当前队列第一个数所在的行
                            int col = Integer.parseInt(peek.split(",")[1]);// 算出当前队列第一个数所在的列

                            // 首先判断上
                            if (row > 0 && grid[row - 1][col] == '1') {
                                queue.offer((row - 1) + "," + col);
                                grid[row - 1][col] = '0';
                            }
                            // 判断下方
                            if (row + 1 < grid.length && grid[row + 1][col] == '1') {
                                queue.offer((row + 1) + "," + col);
                                grid[row + 1][col] = '0';
                            }
                            // 判断左面
                            if (col > 0 && grid[row][col - 1] == '1') {
                                queue.offer(row + "," + (col - 1));
                                grid[row][col - 1] = '0';
                            }
                            // 判断右面
                            if (col + 1 < grid[0].length && grid[row][col + 1] == '1') {
                                queue.offer(row + "," + (col + 1));
                                grid[row][col + 1] = '0';
                            }
                        }
                    }

                }
            }
            return landNum;
        }
}